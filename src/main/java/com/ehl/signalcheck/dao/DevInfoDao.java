package com.ehl.signalcheck.dao;

import com.ehl.signalcheck.entity.DevInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevInfoDao extends JpaRepository<DevInfo, Long> {
    /**
     * 根据 所有的点位 查询 所有设备信息
     * @param pointids
     * @return
     */
    List<DevInfo> findDevInfosByPointidIn(List<String> pointids);

    /**
     * 根据 设备类型 查询 出所有的设备.
     * --08 表示 信号机
     * @param devType
     * @return
     */
    List<DevInfo> findDevInfoByType(String devType);
}
