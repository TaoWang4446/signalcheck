package com.ehl.signalcheck.pojo;

/**
 * @ClassName: ErrorNo
 * @Description: TODO(错误码类)
 *
 */
public class ErrorNo {
	// dev fault error no
	public final static int HK_DEV_TYPE = 1;         // 海康的设备
	// 海康机柜
	public final static int CABINET_TEMP_ERR = 101;  // 机柜温度异常
	public final static int CABINET_HIM_ERR = 102;   // 机柜湿度异常
	public final static int CABINET_DOOR_ERR = 103;  // 机柜门状态异常
	public final static int CABINET_SHOCK_ERR = 104; // 机柜异常震动
	public final static int CABINET_OTHER_ERR = 105; // 其他异常
	// 海康抓拍单元
	public final static int CAMERA_TEMP_ERR = 201;   // 抓拍单元温度异常
	public final static int CAMERA_HIM_ERR = 202;    // 抓拍单元湿度异常
	public final static int CAMERA_DSP_ERR = 203;    // 摄像机 DSP 负载率异常
	public final static int CAMERA_MEM_ERR = 204;    // 摄像机内存使用率异常
	public final static int CAMERA_CFG_ERR = 205;    // 摄像机参数配置异常
	public final static int CAMERA_DEF_ERR = 206;    // 摄像机布防异常
	public final static int CAMERA_OWN_ERR = 207;    // 抓拍单元故障
	public final static int CAMERA_OTHER_ERR = 208;  // 其他异常
	// 海康补光灯
	public final static int LIGHT_OWN_ERR = 301;     // 补光灯故障
	// 海康雷达
	public final static int RADIO_TEMP_ERR = 401;    // 雷达故障
	// 海康车辆检测处理器
	public final static int VEH_CARD_ERR = 501;      // 车检卡异常
	public final static int VEH_COIL_ERR = 502;      // 地感线圈异常
	public final static int VEH_CPU_ERR = 503;       // 车辆检测处理器异常
	public final static int VEH_OTHER_ERR = 504;     // 其他异常
	// 海康交通信号灯检测器
	public final static int TRAFFIC_LIGHT_ERR = 0601;       // 信号灯电信号异常
	public final static int TRAFFIC_LIGHT_CHECK_ERR = 0602; // 交通信号灯检测器异常
	// 海康终端服务器
	public final static int TERMINAL_TEMP_ERR = 701; // 终端服务器温度异常
	public final static int TERMINAL_CPU_ERR = 702;  // 终端服务器 CPU 使用率异常
	public final static int TERMINAL_MEM_ERR = 703;  // 终端服务器内存使用率异常
	public final static int TERMINAL_DISK_ERR = 704; // 终端服务器存储空间异常
	public final static int TERMINAL_SOFT_ERR = 705; // 终端服务器软件异常
	public final static int TERMINAL_OTHER_ERR = 706;// 其他异常
	public final static int TERMINAL_OWN_ERR = 207;  // 终端服务器异常
	// 海康视频分析记录仪
	public final static int AV_TEMP_ERR = 801;       // 视频分析记录仪温度异常
	public final static int AV_CPU_ERR = 802;        // 视频分析记录仪 CPU 使用率异常
	public final static int AV_MEM_ERR = 803;        // 视频分析记录仪内存使用率异常
	public final static int AV_DISK_ERR = 804;       // 视频分析记录仪存储空间异常
	public final static int AV_SOFT_ERR = 805;       // 视频分析记录仪软件异常
	public final static int AV_OTHER_ERR = 806;      // 其他异常
	public final static int AV_OWN_ERR = 807;        // 视频分析记录仪异常
	// 海康牌识处理单元
	public final static int REC_AV_IN_ERR = 901;     // 视频输入异常
	public final static int REC_OWN_ERR = 902;       // 牌识处理单元异常
	// 海康出入口控制终端
	public final static int IO_TEMP_ERR = 1001;      // 出入口控制终端温度异常
	public final static int IO_CPU_ERR = 1002;       // 出入口控制终端 CPU 使用率异常
	public final static int IO_MEM_ERR = 1003;       // 出入口控制终端内存使用率异常
	public final static int IO_DISK_ERR = 1004;      // 出入口控制终端存储空间异常
	public final static int IO_SOFT_ERR = 1005;      // 出入口控制终端软件异常
	public final static int IO_OTHER_ERR = 1006;     // 其他异常
	public final static int IO_OWN_ERR = 1007;       // 出入口控制终端异常
	// 海康LED 诱导屏
	public final static int LED_OWN_ERR = 1101;      // LED 诱导屏异常
	// 海康串口控制器
	public final static int SEL_OWN_ERR = 1201;      // 串口控制器异常
	// 大华设备离线
	public final static int DEV_OFF_ERR = 2001;      // 设备离线

	// net fault error no
	public final static int NET_OUT_ERR = 2101; // 网络故障
	public final static int SDK_ERR = 2102; // SDK调用失败
	public final static int REAL_PLAY_ERR = 2103; // 视频流故障
	public final static int REJECTION_CONN = 2104; // 拒绝连接
	public final static int DEV_SERVICE_ERROR = 2105; // 设备服务异常
	// other error no
	public final static int EDEV_NO_AIR_ERR = 2201; // 总空开离线
	public final static int EDEV_NO_E_ERR = 2202; // 市电断电
	public final static int EDEV_TRIP_ERR = 2203; // 总空开跳闸
	public final static int EDEV_DEV_AIR_ERR = 2204; // 设备空开跳闸
	public final static int EDEV_NO_AUTODEV_ERR = 2205; // 智能运维设备离线
	public final static int EDEV_AUTODEV_ERR = 2206;  // 智能运维复判出错（界面显示智能运维设备离线）
	public final static int EIR_DOOR_OPEN = 2301; // 柜门异常
	public final static int EIR_ARREST_ERR = 2302; // 防雷器异常
}
