package com.ayang818.honor.datacollection.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName JSONUtil
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 11:02
 **/
public class JSONUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JSONUtil.class);

    public static String parseEnumToJson(Object object) {
        SerializeConfig config = new SerializeConfig();
        try {
            config.configEnumAsJavaBean((Class<? extends Enum>) object.getClass());
        } catch (ClassCastException e) {
            LOGGER.error("cast class" + object.getClass().toString() + "error");
            throw new RuntimeException(e);
        }
        return JSON.toJSONString(object, config);
    }

    public static String parseObjectToJson(Object object) {
        return JSON.toJSONString(object);
    }
}
