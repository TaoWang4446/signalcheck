package com.ehl.signalcheck.service.impl;

import com.ehl.signalcheck.entity.DevpointInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevpointInfoServiceImplTest {

    @Autowired
    private DevpointInfoServiceImpl devpointInfoService;

    @Test
    public void findAll() {
        List<DevpointInfo> devpointInfoList = devpointInfoService.findAll();
        System.out.println(devpointInfoList);
    }
}