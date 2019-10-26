package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.exception.ICustomizeResponseCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName HonorController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/26 13:23
 **/
@RestController
public class HonorController {

    @RequestMapping(value = "/api/honor/competition", method = RequestMethod.POST)
    public ICustomizeResponseCode createOrUpdateCompetitionHonor(HttpServletRequest request) {
        return null;
    }
}
