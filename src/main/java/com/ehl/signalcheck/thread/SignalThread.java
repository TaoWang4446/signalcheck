package com.ehl.signalcheck.thread;

import com.ehl.signalcheck.dto.Message;
import com.ehl.signalcheck.dto.MsgResult;
import com.ehl.signalcheck.entity.DevInfo;
import com.ehl.signalcheck.pojo.ErrorNo;
import com.ehl.signalcheck.util.*;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SignalThread implements Runnable {
    private List<DevInfo> list;
    private CountDownLatch countDownLatch;

    public SignalThread(List<DevInfo> list, CountDownLatch countDownLatch) {
        this.list = list;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("开始时间：" + JodaTimeUtil.dateToStr(new Date()));
        if (null != list) {
            String url = "http://20.0.51.248:8000";
            for (DevInfo devInfo : list) {
                Message msg = new Message();
                String ipdress = devInfo.getIpaddress();
                boolean flag = PingUtil.ping(ipdress, 3, 3000);
                boolean stateFlag = HttpStatusCodeUtil.getResponseState(ipdress);
                if (stateFlag) {
                    //1.如果ping不通
                    System.out.println(ipdress + "可访问");
                    msg = MsgResult.resultInfo(devInfo, ErrorNo.ERROR_NO);
                } else {
                    System.out.println(ipdress + "不可访问");
                    msg = MsgResult.resultInfo(devInfo, ErrorNo.REJECTION_CONN);
                }

                try {
                    MyHttpClient.doPost(url, JsonUtil.toJson(msg));
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }

        }
        countDownLatch.countDown();//发出线程任务完成的信号

        System.out.println("结束时间：" + JodaTimeUtil.dateToStr(new Date()));
    }
}