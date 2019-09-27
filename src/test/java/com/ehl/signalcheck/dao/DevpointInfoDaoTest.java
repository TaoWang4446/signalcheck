package com.ehl.signalcheck.dao;

import com.ehl.signalcheck.entity.DevpointInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DevpointInfoDaoTest {

    @Autowired
    private DevpointInfoDao devpointInfoDao;

    @Test
    public void testDevPointQuery(){
        List<DevpointInfo> devpointInfos = devpointInfoDao.findAll();
        System.out.println(devpointInfos);
    }
}