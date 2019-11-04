package com.ayang818.honor.datacollection.dto;

import com.ayang818.honor.datacollection.exception.ICustomizeResponseCode;

/**
 * @ClassName Result
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/11/4 15:52
 **/
public class Result implements ICustomizeResponseCode {
    private Integer code;
    private String message;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
