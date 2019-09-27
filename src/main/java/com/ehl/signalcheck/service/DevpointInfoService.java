package com.ehl.signalcheck.service;

import com.ehl.signalcheck.entity.DevpointInfo;

import java.util.List;

public interface DevpointInfoService {
    /**
     * 获取所有的点位信息
     * @return
     */
    List<DevpointInfo> findAll();
}
