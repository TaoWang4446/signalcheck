package com.ehl.signalcheck.exception;

import com.ehl.signalcheck.enums.ResultEnum;

public class SignalException extends RuntimeException {
    private Integer code;

    public SignalException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public SignalException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}