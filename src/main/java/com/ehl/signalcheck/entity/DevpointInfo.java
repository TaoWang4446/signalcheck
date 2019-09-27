package com.ehl.signalcheck.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
@Proxy(lazy = false)
public class DevpointInfo {
    @Id
    private Long id;//流水号
    private String pointcode;//安装点编号
    private String pointname;//安装点名称
    private String provider;//供应商
    private String installationsite;//安装地点
    private Date installationdate;//安装时间
    private String lon;//经度
    private String lat;//纬度
    private String pointtype;//安装点类型
    private String adminiarea;//行政辖区
    private String departmentid;//管辖单位
    private String pointfeature;//点位特征
    private String roadfeature;//道路特征
    private String valid;//是否有效（1：有效，0：无效）
    private String remark;//备注信息
    private String ebpStatus;//数据状态（1：创建，2：修改）
    private Integer ebpUserid;//操作员id（与用户表id关联）
    private Date ebpOperatetime;//操作时间
    private String dldm;//道路代码
    private String lddm;//路段路口代码
    private String status;
}
