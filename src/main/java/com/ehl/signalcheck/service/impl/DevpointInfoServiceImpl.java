package com.ehl.signalcheck.service.impl;

import com.ehl.signalcheck.dao.DevpointInfoDao;
import com.ehl.signalcheck.entity.DevpointInfo;
import com.ehl.signalcheck.service.DevpointInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevpointInfoServiceImpl implements DevpointInfoService {

    @Autowired
    private DevpointInfoDao devpointInfoDao;

    @Override
    public List<DevpointInfo> findAll() {
        return devpointInfoDao.findAll();
    }
}
