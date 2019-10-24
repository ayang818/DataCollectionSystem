package com.ayang818.honor.datacollection.handler;

import com.ayang818.honor.datacollection.exception.CustomizeException;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.exception.ExceptionResponseCode;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName GlobalExceptionHandler
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 13:51
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = CustomizeException.class)
    public String jsonErrorHandler(HttpServletRequest req, CustomizeException e) throws Exception {
        return JSONUtil.parseObjectToJson(new ExceptionResponseCode(e.getCode(), e.getMessage()));
    }

    @ResponseBody
    @ExceptionHandler(value = MultipartException.class)
    public String jsonUploadErrorErrorHandler(HttpServletRequest req, MultipartException e) throws Exception {
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.upLoadError);
    }
}
