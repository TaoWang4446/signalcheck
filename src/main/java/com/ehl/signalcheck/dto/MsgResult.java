package com.ehl.signalcheck.dto;

import com.ehl.signalcheck.entity.DevInfo;
import com.ehl.signalcheck.util.JodaTimeUtil;

import java.util.Date;

public class MsgResult {

    private MsgResult(){}

    public static Message resultInfo(DevInfo devInfo,int param) {
        Message message = new Message();
        DevsStatus devsStatus = new DevsStatus();
        devsStatus.setDevid(devInfo.getCode());
        devsStatus.setDevfault_err(0);
        devsStatus.setNetwork_err(param);

        message.setPosid(devInfo.getPointid());
        message.setOccur_time(JodaTimeUtil.dateToStr(new Date()));
        message.setDevs_status(devsStatus);

        return message;
    }

}
