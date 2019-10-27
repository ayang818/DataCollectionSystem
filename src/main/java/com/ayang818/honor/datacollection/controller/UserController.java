package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.dto.login.LoginDTO;
import com.ayang818.honor.datacollection.dto.login.LoginSuccessDTO;
import com.ayang818.honor.datacollection.dto.user.EditProfileReceiveDTO;
import com.ayang818.honor.datacollection.dto.user.UserInfoDTO;
import com.ayang818.honor.datacollection.enumdata.UserDataEnum;
import com.ayang818.honor.datacollection.exception.CustomizeException;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.model.Admin;
import com.ayang818.honor.datacollection.model.Student;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.service.AdminService;
import com.ayang818.honor.datacollection.service.RegisterService;
import com.ayang818.honor.datacollection.service.UserService;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName LoginController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 10:44
 **/

@RestController
public class UserController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/api/login/user", method = RequestMethod.POST)
    public Object loginAsUser(@RequestBody LoginDTO loginDTO) {
        // 检查学生数据库中有没有这个学号
        Student student = registerService.checkIfUserExists(loginDTO);
        if (student == null) {
            throw new CustomizeException(CustomizeResponseCode.USER_ISNOT_EXISTS);
        }
        // 检查是否登陆过
        String token = userService.checkIfFirstLogin(loginDTO);
        if (token != null) {
            LoginSuccessDTO loginSuccessDTO = new LoginSuccessDTO();
            loginSuccessDTO.setCode(200);
            loginSuccessDTO.setMessage(CustomizeResponseCode.SUCCESS.getMessage());
            loginSuccessDTO.setToken(token);
            return loginSuccessDTO;
        }
        // 首次登入系统
        User user = new User();
        user.setStudentName(student.getStudentName());
        user.setUsername(student.getSchoolNumber());
        user.setPassword(String.valueOf(user.getUsername()));
        user.setGmtCreate(new Date(System.currentTimeMillis()));
        user.setGmtModified(user.getGmtCreate());
        user.setType(UserDataEnum.USERTYPE);
        String token1 = UUID.randomUUID().toString();
        user.setToken(token1);
        userService.insert(user);
        LoginSuccessDTO loginSuccessDTO = new LoginSuccessDTO();
        loginSuccessDTO.setCode(200);
        loginSuccessDTO.setMessage(CustomizeResponseCode.SUCCESS.getMessage());
        loginSuccessDTO.setToken(token1);
        return loginSuccessDTO;
    }

    @RequestMapping(value = "/api/login/admin", method = RequestMethod.POST)
    public Object loginAsAdmin(@RequestBody LoginDTO loginDTO) {
        // 管理员权限登陆
        String token = adminService.checkIfExists(loginDTO);
        LoginSuccessDTO loginSuccessDTO = new LoginSuccessDTO();
        loginSuccessDTO.setCode(200);
        loginSuccessDTO.setMessage(CustomizeResponseCode.SUCCESS.getMessage());
        loginSuccessDTO.setToken(token);
        return loginSuccessDTO;
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public UserInfoDTO getUserInfo(HttpServletRequest request) {
        byte type = (byte) request.getSession().getAttribute("type");
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        if (type == UserDataEnum.USERTYPE) {
            User user = (User) request.getSession().getAttribute("user");
            try {
                userInfoDTO.setStudentName(user.getStudentName());
                userInfoDTO.setUsername(String.valueOf(user.getUsername()));
                userInfoDTO.setType((int) user.getType());
            } catch (NullPointerException e) {
                throw new CustomizeException(CustomizeResponseCode.USER_ISNOT_EXISTS);
            }
        } else if (type == UserDataEnum.ADMINTYPE) {
            Admin admin = (Admin) request.getSession().getAttribute("user");
            try {
                userInfoDTO.setUsername(admin.getUsername());
                userInfoDTO.setType((int) admin.getType());
            } catch (NullPointerException e) {
                throw new CustomizeException(CustomizeResponseCode.USER_ISNOT_EXISTS);
            }
        }
        return userInfoDTO;
    }

    @RequestMapping(value = "/api/profile/edit", method = RequestMethod.POST)
    public String updatePassword(@RequestBody EditProfileReceiveDTO receiveDTO, HttpServletRequest request) {
        byte type = (byte) request.getSession().getAttribute("type");
        if (type == UserDataEnum.USERTYPE) {
            User user = (User) request.getSession().getAttribute("user");
            userService.updateUserPassword(user, receiveDTO);
        } else if (type == UserDataEnum.ADMINTYPE) {
            Admin admin = (Admin) request.getSession().getAttribute("user");
            adminService.updateUserPassword(admin, receiveDTO);
        }

        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }
}
