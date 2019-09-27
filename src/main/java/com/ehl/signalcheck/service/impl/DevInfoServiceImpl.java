package com.ehl.signalcheck.service.impl;

import com.ehl.signalcheck.dao.DevInfoDao;
import com.ehl.signalcheck.dao.DevpointInfoDao;
import com.ehl.signalcheck.entity.DevInfo;
import com.ehl.signalcheck.service.DevInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevInfoServiceImpl implements DevInfoService {

    @Autowired
    private DevInfoDao devInfoDao;

    @Autowired
    private DevpointInfoDao devpointInfoDao;



    @Override
    public List<DevInfo> findDevInfosByPointidIn(List<String> pointids) {
        //精简方法(java8, lambda)
       /* List<DevpointInfo> devpointInfoList = devpointInfoDao.findAll();
        List<String> pointids = devpointInfoList.stream()
                .map(e -> e.getPointcode())
                .collect(Collectors.toList());*/
        return devInfoDao.findDevInfosByPointidIn(pointids);
    }

    @Override
    public List<DevInfo> findDevInfoByType(String devType) {
        return devInfoDao.findDevInfoByType(devType);
    }
}
