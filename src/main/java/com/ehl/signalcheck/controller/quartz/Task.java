package com.ehl.signalcheck.controller.quartz;


import com.ehl.signalcheck.dto.DevsStatus;
import com.ehl.signalcheck.dto.Message;
import com.ehl.signalcheck.entity.Content;
import com.ehl.signalcheck.entity.DevInfo;
import com.ehl.signalcheck.enums.ResultEnum;
import com.ehl.signalcheck.exception.SignalException;
import com.ehl.signalcheck.pojo.ErrorNo;
import com.ehl.signalcheck.service.DevInfoService;
import com.ehl.signalcheck.util.JodaTimeUtil;
import com.ehl.signalcheck.util.PingUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Slf4j
public class Task {

    @Autowired

    private DevInfoService devInfoService;

    public void xhjCheck(){

        /**
         * 1.查询 出 所有的 设备(信号机设备) 08,从设备信息表中
         * 2.然后找到 信号机的ip
         * 3.ping  ip
         * 4.http get ip
         * 5.然后根据ip去匹配 表中的错误
         * 6.通过post请求 写入到 db(msg: msg :{"posid":"371702000001","occur_time":"2019-09-26 15:42:14","devs_status":[{"devid":"1000000000000000108","devfault_err":0,"network_err":0}],"msgtype":"2"}
         */

        Message message = new Message();
        List<DevInfo> devInfoList = devInfoService.findDevInfoByType(Content.DEV_XHJ_TYPE);
        if (CollectionUtils.isEmpty(devInfoList)) {
            log.error("【信号机】数量:, signalnum={}", devInfoList.size());
            throw new SignalException(ResultEnum.SIGNAL_NUM_NULL);
        }

        //lamda java8优化
       // List<String> ipdressList = devInfoList.stream().map(e -> e.getIpaddress()).collect(Collectors.toList());


        for (DevInfo devInfo : devInfoList) {
            String ipdress = devInfo.getIpaddress();
            boolean flag = PingUtil.ping(ipdress,3,3000);
            if(!flag){
                //1.如果ping不通
                DevsStatus devsStatus = new DevsStatus();
                devsStatus.setDevid(devInfo.getCode());
                devsStatus.setDevfaultErr(0);
                devsStatus.setNetworkErr(ErrorNo.NET_OUT_ERR);

                message.setPosid(devInfo.getPointid());
                message.setOccurTime(JodaTimeUtil.dateToStr(new Date()));
                message.setDevsStatus(devsStatus);
            }

        }


    }
}
