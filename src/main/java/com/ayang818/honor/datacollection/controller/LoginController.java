package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.dto.login.LoginDTO;
import com.ayang818.honor.datacollection.dto.login.LoginSuccessDTO;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.model.Student;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.service.RegisterService;
import com.ayang818.honor.datacollection.service.UserService;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/**
 * @ClassName LoginController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 10:44
 **/

@RestController
public class LoginController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @ResponseBody
    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public Object login(@RequestBody LoginDTO loginDTO) {
        // 检查学生数据库中有没有这个学号
        Student student = registerService.checkIfUserExists(loginDTO);
        if (student == null) {
            return JSONUtil.parseEnumToJson(CustomizeResponseCode.USER_ISNOT_EXISTS);
        }
        // 检查是否登陆过
        String token = userService.checkIfFirstLogin(student.getSchoolNumber());
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
        String token1 = UUID.randomUUID().toString();
        user.setToken(token1);
        userService.insert(user);
        LoginSuccessDTO loginSuccessDTO = new LoginSuccessDTO();
        loginSuccessDTO.setCode(200);
        loginSuccessDTO.setMessage(CustomizeResponseCode.SUCCESS.getMessage());
        loginSuccessDTO.setToken(token1);
        return loginSuccessDTO;
    }
}
