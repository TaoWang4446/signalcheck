package com.ehl.signalcheck.service;

import com.ehl.signalcheck.entity.DevInfo;

import java.util.List;

public interface DevInfoService {
    /**
     * 获取所有的设备信息by 点位id
     * @return
     */
    List<DevInfo> findDevInfosByPointidIn(List<String> pointids);


    /**
     * 根据设备类型 查询 素有的设备
     * 08 表示 信号机
     * @param devType
     * @return
     */
    List<DevInfo> findDevInfoByType(String devType);


}
