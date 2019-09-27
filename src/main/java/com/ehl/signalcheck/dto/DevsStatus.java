package com.ehl.signalcheck.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DevsStatus {

    //设备ip
    private String devid;

    //设备错误
    @JsonProperty("devfault_err")
    private int devfaultErr;

    //网络错误
    @JsonProperty("network_err")
    private int networkErr;
}
