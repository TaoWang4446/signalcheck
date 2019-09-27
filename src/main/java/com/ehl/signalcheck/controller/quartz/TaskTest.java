package com.ehl.signalcheck.controller.quartz;

import com.ehl.signalcheck.util.JodaTimeUtil;

import java.util.Date;

public class TaskTest {
    public static void main(String[] args) {
       // DateTime dateTime=new DateTime();
       // String dateString = dateTime.toString("yyyyMMdd");
        //DateTimeFormatter forPattern = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        //dateString=forPattern.print(dateTime);
        //System.out.println(forPattern.print(new DateTime()));

        System.out.println(JodaTimeUtil.dateToStr(new Date()));
    }
}
