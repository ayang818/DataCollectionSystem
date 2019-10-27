package com.ayang818.honor.datacollection.util;

import com.ayang818.honor.datacollection.enumdata.UserDataEnum;
import com.ayang818.honor.datacollection.exception.CustomizeException;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.model.Admin;
import com.ayang818.honor.datacollection.model.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName GetUserTypeUtil
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/27 14:52
 **/
public class GetUserTypeUtil {
    public static Admin getAdmin(HttpServletRequest request) {
        if ((byte) request.getSession().getAttribute("type") == UserDataEnum.ADMINTYPE) {
            Admin admin = (Admin) request.getSession().getAttribute("user");
            if (admin != null) {
                return admin;
            }
        }
        throw new CustomizeException(CustomizeResponseCode.NOT_ADMIN);
    }

    public static User getUser(HttpServletRequest request) {
        if ((byte) request.getSession().getAttribute("type") == UserDataEnum.USERTYPE) {
            User user = (User) request.getSession().getAttribute("user");
            if (user != null) {
                return user;
            }
        }
        throw new CustomizeException(CustomizeResponseCode.USER_ISNOT_EXISTS);
    }
}
