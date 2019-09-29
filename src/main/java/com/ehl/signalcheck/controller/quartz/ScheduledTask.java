package com.ehl.signalcheck.controller.quartz;
 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

import com.ehl.signalcheck.entity.DevInfo;
import com.ehl.signalcheck.service.DevInfoService;
import com.ehl.signalcheck.thread.SignalThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private DevInfoService devInfoService;

    //导入数据
    public void importData(List list) {
        //10分一组
        int count = 10;
        int listSize = list.size();
        //线程数
        int RunSize = (listSize / count) + 1;

        ThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(RunSize);
        CountDownLatch countDownLatch = new CountDownLatch(RunSize);

        for (int i = 0; i < RunSize; i++) {
            List newList = null;
            if ((i + 1) == RunSize) {
                int startIndex = (i * count);
                int endIndex = list.size();
                newList = list.subList(startIndex, endIndex);
                System.out.println(newList.size());
            } else {
                int startIndex = i * count;
                int endIndex = (i + 1) * count ;
                newList = list.subList(startIndex, endIndex);
                System.out.println(newList.size());
            }

            SignalThread task = new SignalThread(newList, countDownLatch);
            executor.execute(task);
        }

        try {
            countDownLatch.await();  //主线程等待所有线程完成任务
        } catch (Exception e) {
            e.printStackTrace();
        }

        //所有线程完成任务后的一些业务
        System.out.println("以下是所有线程完成任务后的一些业务!");
        //关闭线程池
        executor.shutdown();

    }

    //@Scheduled(cron = "${jobs.cron}")
    @Scheduled(initialDelay = 2000,fixedRate = 5000*60)
    public void getTask2() {
        System.out.println("任务:,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
        List<DevInfo> devInfoList = devInfoService.findDevInfoByType("01");
        System.out.println(devInfoList.size());
        importData(devInfoList);
    }
}





