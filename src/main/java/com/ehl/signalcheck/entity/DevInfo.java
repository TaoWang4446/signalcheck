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
public class DevInfo {
    @Id
    private Long id;     //     流水号
    private String name;     //     设备名称
    private String type;     //     设备类型
    private String model;     //     设备型号
    private String code;     //     设备编号
    private Date producedate;     //     生产日期
    private Date installdate;     //     安装日期
    private Date acceptancedate;     //     验收日期
    private Date warrantydate;     //     保质日期
    private String manufaoturer;     //     制造商
    private String supplier;     //     供应商
    private String contractor;     //     承建商
    private String maintenancecompany;     //     维保公司
    private String coordinate;     //     经纬度坐标
    private String ipaddress;     //     IP地址
    private String port;     //     端口
    private String carrieroperator;     //     通讯运营商
    private String communicationmode;     //     通讯方式 无线、光纤
    private String electricitymode;     //     取电方式-市电、太阳能
    private String powercompanyname;     //     供电单位名称
    private String powercompanyphone;     //     供电单位电话
    private String manageagency;     //     管理机构大队
    private String manageagency2;     //     管理机构中队
    private String belongarea;     //     所属辖区
    private String monitor;     //     是否监控
    private String devicestate;     //     设备状态
    private String principalname;     //     负责人姓名
    private String contactmode;     //     联系方式
    private String usestate;     //     使用状态
    private String direction;     //     设备方向
    private String installaddress;     //     安装地点
    private String belongroad;     //     所属道路
    private String belongroadsection;     //     所属路段
    private String belongintersection;     //     所属路口
    private String pointid;     //     设备点编号
    private String matrixcode;     //     矩阵编号
    private String channelcode;     //     通道编号
    private String thirdsyscode;     //     第三方系统编号
    private String image;     //     图片信息
    private String ctrlflag;     //     视频设备是否可控标志
    private String dvruser;     //     硬盘录像机用户名
    private String dvrpwd;     //     硬盘录像机密码
    private String dvrport;     //     硬盘录像机端口号
    private String channelcount;     //     通道数量(当设备是硬盘录像机时有效)
    private String illegaladdrid;     //     违法地点编号
    private String logicchannel;     //     视频逻辑编号
    private String belongto;     //     所属工控机编号
    private String csnaptype;     //     抓拍类型(0:无 1:图片 2:视频)
    private String playtype;     //     播放方式 1:硬盘录像机播放 2:流媒体播放
    private String passfunc;     //     卡口功能项(1:有  0:无)
    private String epfunc;     //     电子警察功能项(1:有  0:无)
    private String osfunc;     //     超速功能项(1:有  0:无)
    private String vediofunc;     //     视频功能项(1:有  0:无)
    private String gpsfunc;     //     GPS功能项(1:有  0:无)
    private String inducefunc;     //     诱导功能项(1:有  0:无)
    private String signalfunc;     //     信号功能项(1:有  0:无)
    private String flowfunc;     //     流量检测功能项(1:有  0:无)
    private String eventfunc;     //     事件检测功能项(1:有  0:无)
    private String gpscarno;     //     GPS车辆号牌号码
    private String gpsradiono;     //     GPS呼号
    private String vmstype;     //     诱导屏类型(1:光带 2:点阵)
    private String vmssize;     //     诱导屏设备尺寸
    private String gpstype;     //     GPS类型
    //1-打开；2-关闭；3-打开光带；4-关闭光带；5-打开点阵；6-关闭点阵
    private String vmsstatus;     //     诱导屏启动状态：
    private String ifuse;     //     是否使用
    private String belongtoproj;     //     所属项目
    private String patroltype;     //     巡逻类型
    private String districttype;     //     区域类型
    private String districtname;     //     区域名称
    private String patroldistrict;     //     巡逻区域
    private String desprition;     //     设备描述
    private String triggertype;     //     设备触发方式 包括线圈、视频等
    private String imagelevel;     //     图像类型  高清、标清
    private String electposition;     //     取电位置
    private String passthreshold;     //     过车阈值    大于此值为正常，小于此值为报警
    private String illegalthreshold;     //     违法阈值    大于此值为正常，小于此值为报警
    private String isvalid;     //     是否定用：1-启用0-停用
    private String laneamount;     //     摄像机对应的车道总数
    // 10高空、11路段、12路口、20车管、21驾管、24执法办案、25工作环境
    private String rectype;     //     视频分类：
    private String weatherArea;     //     天气所属区县
    private String stateDetail;     //     设备状态详情
    private String laneExclude;     //     非机动车道
    private String cameraPixel;     //     摄像机类型:200W,500W;
    private String standard;     //     规格，1:横屏，2:竖屏
    private String remark;     //     备注
    private String ebpStatus;     //     数据状态（1：创建，2：修改，3：删除）
    private String ebpUserid;     //     操作员id（与用户表id关联）
    private Date ebpOperatetime;     //     操作时间
    private String ishidden;     //


}
