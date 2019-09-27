package com.ehl.signalcheck.service.impl;

import com.ehl.signalcheck.dao.DevInfoDao;
import com.ehl.signalcheck.entity.DevInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DevInfoServiceImplTest {

    @Autowired
    private DevInfoDao devInfoDao;

    @Test
    public void findDevInfosByPointidIn() {
        List<String> poinds = Arrays.asList("100000000008","371702000001","371702000002","371702000003","371702000004");
        List<DevInfo> devInfoList = devInfoDao.findDevInfosByPointidIn(poinds);
        System.out.println(devInfoList);
    }

    @Test
    public void findDevInfoByType() {
        List<DevInfo> devInfoList = devInfoDao.findDevInfoByType("01");//01:表示电警 08表示信号机
        System.out.println(devInfoList);
    }
}