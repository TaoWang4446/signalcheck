package com.ehl.signalcheck.mapper.pointdevs;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PointInfoMapperTest {

    @Autowired
    private PointInfoMapper pointInfoMapper;

    @Test
    public void getPoindCode() {
       List<String> pointInfos =  pointInfoMapper.getPoindCode();
        System.out.println(pointInfos);
    }
}