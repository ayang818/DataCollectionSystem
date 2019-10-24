package com.ayang818.honor.datacollection.exception;

/**
 * @ClassName ExceptionResponseCode
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 13:56
 **/
public class ExceptionResponseCode implements ICustomizeResponseCode {
    private Integer code;
    private String message;
    public ExceptionResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
