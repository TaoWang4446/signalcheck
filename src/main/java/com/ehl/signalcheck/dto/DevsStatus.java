package com.ehl.signalcheck.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DevsStatus {

    //设备ip
    private String devid;

    //设备错误
    @JsonProperty("devfaultErr")
    private int devfault_err;

    //网络错误
    @JsonProperty("networkErr")
    private int network_err;
}
