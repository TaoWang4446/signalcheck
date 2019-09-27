package com.ehl.signalcheck.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
public class Content {

	private Content(){}

	private static Map<String, String> facMap = new HashMap<>();
	public static final String ZX_DEV_TYPE = "01";   // 中兴的设备
	public static final String DH_DEV_TYPE = "02";   // 大华的设备
	public static final String HK_DEV_TYPE = "03";   // 海康的设备
	public static final String NJLS_DEV_TYPE = "04"; // 南京莱斯的设备
	public static final String SY_DEV_TYPE = "05";   // 三洋的设备
	public static final String SX_DEV_TYPE = "06";   // 神讯的设备
	public static final String TD_DEV_TYPE = "07";   // 天地的设备
	public static final String WXHT_DEV_TYPE = "08"; // 无锡华通的设备
	public static final String XZX_DEV_TYPE = "09";  // 新中新的设备
	public static final String YFT_DEV_TYPE = "10";  // 英飞拓的设备
	public static final String OTHER_DEV_TYPE = "11";// 其他的设备
	public static final String DEV_EP_TYPE = "01";  // 设备类型——电警
	public static final String DEV_BAY_TYPE = "02"; // 设备类型——卡口
	public static final String DEV_VID_TYPE = "05"; // 设备类型——视频
	public static final String DEV_TERM_TYPE = "09"; // 设备类型——终端
	public static final String DEV_AUTO_OPER_TYPE = "10"; // 智能运维产品
	public static final String DEV_XHJ_TYPE = "08";//设备类型----信号机
	public static final int I_WAIT_TIME = 2;
	public static final int HK_DEV_PORT = 8000;   // 访问海康设备的port
	public static final int DH_DEV_PORT = 37777;  // 访问大华设备的port

	private boolean  bFirstCreateMap = true;

	public static void createMaps() {
		facMap.put("中兴", "01");
		facMap.put("大华", "02");
		facMap.put("海康", "03");
		facMap.put("莱斯", "04");
		facMap.put("三洋", "05");
		facMap.put("神讯", "06");
		facMap.put("天地伟业", "07");
		facMap.put("华通", "08");
		facMap.put("新中新", "09");
		facMap.put("英飞拓", "10");
	}

	public static String getfacid(String key) {
		String value = "";
		if (facMap.get(key) != null) {
			value = facMap.get(key);
		}
		return value;
	}


	//	public static final int iWaitTime = 0;    // 菏泽测试
	private static Map<String, Integer> waitTimesMap = new HashMap<>();
	private static Map<String, Date> dateMap = new HashMap<>();

	public static void insertWTMap(String devid, int waittime) {
		log.info(devid + " *** " + waittime);
		waitTimesMap.put(devid, waittime);
	}

	public static int getWaitTimes(String devid) {
		log.info("getWaitTimes:" + devid);
		if (waitTimesMap.containsKey(devid))
			return waitTimesMap.get(devid);
		else
			return 0;
	}

	public static void insertDateMap(String devid, Date dt) {
		dateMap.put(devid, dt);
	}

	public static Date getDateTm(String devid) {
		if (dateMap.containsKey(devid))
			return dateMap.get(devid);
		else
			return new Date();
	}
}