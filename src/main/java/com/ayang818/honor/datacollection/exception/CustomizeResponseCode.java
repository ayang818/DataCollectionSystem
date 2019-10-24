package com.ayang818.honor.datacollection.exception;

/**
 * @ClassName CustomizeResponseCode
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 10:52
 **/
public enum CustomizeResponseCode implements ICustomizeResponseCode {
    // 请求成功
    isSuccess(200, "成功"),
    // 服务端错误
    isServerError(500, "服务端错误"),
    isReadExcelError(500, "读取excel错误"),
    upLoadError(500, "文件上传失败");

    private Integer code;
    private String message;

    CustomizeResponseCode(Integer code, String message) {
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
