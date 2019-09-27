package com.ehl.signalcheck.dto;

import lombok.Data;

@Data
public class DevStatus {
    public String devid = "";    // 设备ID
    public String devip = "";    // 设备IP
    public int devport = 8888;   // 访问设备所需port，海康默认为8000；大华默认为37777
    public String devtype = "";  // 设备类型，卡口/电警/终端服务器
    public String username = ""; // 设备用户名，默认admin
    public String password = ""; // 设备密码
    public int iTimeout = 2000;  // ping超时时间
    public int iCheckTimes = 5;  // ping尝试次数
    public int iOkLimit = 1;     // ping成功连续次数
    public String factorytype = "";  // 视频设备厂家
    public int NStatus;            // 网络状态
    public boolean NStatusChanged; // 网络状态是否有变化
    public int DStatus;            // 设备状态
    public boolean DStatusChanged; // 设备状态是否有变化
    public int devpos;             // 设备在终端服务器的端口号
    public boolean bCheckRealPlay = false; // 设备是否支持检测视频流
    public boolean bRealPlay = false;      // 设备视频流是否正常
    public boolean bHidden = false; // 是否不检测任何状态变化
}
