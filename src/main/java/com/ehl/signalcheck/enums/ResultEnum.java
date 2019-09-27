package com.ehl.signalcheck.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {


    SIGNAL_NUM_NULL(12, "信号机数量为空");
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

