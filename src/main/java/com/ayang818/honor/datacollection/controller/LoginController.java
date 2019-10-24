package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.dto.login.LoginDTO;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.service.RegisterService;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @ResponseBody
    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public Object login(@RequestBody LoginDTO loginDTO) {
        boolean exists = registerService.checkIfUserExists(loginDTO);
        if (!exists) {

        }
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.isSuccess);
    }
}
