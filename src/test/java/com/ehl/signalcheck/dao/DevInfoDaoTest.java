package com.ehl.signalcheck.dao;

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
public class DevInfoDaoTest {

    @Autowired
    private DevInfoDao devInfoDao;

    @Test
    public void getDevInfoByPointId() {
        List<String> poinds = Arrays.asList("100000000008","371702000001","371702000002","371702000003","371702000004");
        List<DevInfo> devInfos = devInfoDao.findDevInfosByPointidIn(poinds);
        System.out.println(devInfos);
    }


}