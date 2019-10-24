package com.ayang818.honor.datacollection.exception;

/**
 * @ClassName CustomizeException
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 13:41
 **/
public class CustomizeException extends RuntimeException {
    private String message;
    private Integer code;
    public CustomizeException(ICustomizeResponseCode errorCode) {
        this.message = errorCode.getMessage();
        this.code = errorCode.getCode();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
