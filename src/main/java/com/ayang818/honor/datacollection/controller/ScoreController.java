package com.ayang818.honor.datacollection.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ScoreController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/25 11:25
 **/
@RestController
public class ScoreController {

    /**
    * @Description 学生给老师打分
    */
    @RequestMapping(value = "/api/score/student", method = RequestMethod.POST)
    public void scoreFromStudent() {

    }

    /**
    * @Description 学院给老师打分的单个接口
    */
    @RequestMapping(value = "/api/score/college", method = RequestMethod.POST)
    public void scoreFromCollege() {

    }
}
