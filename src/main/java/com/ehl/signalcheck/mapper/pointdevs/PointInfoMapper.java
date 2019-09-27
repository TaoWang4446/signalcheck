package com.ehl.signalcheck.mapper.pointdevs;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointInfoMapper {

    List<String> getPoindCode();
}
