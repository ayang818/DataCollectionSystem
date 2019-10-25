package com.ayang818.honor.datacollection.exception;

/**
 * @ClassName CustomizeResponseCode
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 10:52
 **/
public enum CustomizeResponseCode implements ICustomizeResponseCode {
    // 请求成功
    SUCCESS(200, "成功"),
    // 服务端错误
    SERVER_ERROR(500, "服务端错误"),
    READ_EXCEL_FAILED(500, "读取excel错误"),
    UPLOAD_FAILED(500, "文件上传失败"),
    USER_ISNOT_EXISTS(405, "用户不存在，请联系教师添加信息");

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
