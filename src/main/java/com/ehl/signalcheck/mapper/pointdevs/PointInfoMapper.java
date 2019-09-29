package com.ehl.signalcheck.mapper.pointdevs;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointInfoMapper {

    /**
     * 查询所有的点位
     * @return
     */
    List<String> getPoindCode();
}
