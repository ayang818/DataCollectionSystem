package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.enumdata.UserDataEnum;
import com.ayang818.honor.datacollection.exception.ICustomizeResponseCode;
import com.ayang818.honor.datacollection.mapper.TotalHonorMapper;
import com.ayang818.honor.datacollection.model.TotalHonor;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.service.TotalHonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName HonorController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/26 13:23
 **/
@RestController
public class HonorController {

    @Autowired
    private TotalHonorService totalHonorService;

    @RequestMapping(value = "/api/honor/competition", method = RequestMethod.POST)
    public ICustomizeResponseCode createOrUpdateCompetitionHonor(HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value = "/api/honor/list", method = RequestMethod.GET)
    public List<TotalHonor> listSubmittedHonor(HttpServletRequest request) {
        byte type = (byte) request.getSession().getAttribute("type");
        if (type == UserDataEnum.USERTYPE) {
            User user = (User) request.getSession().getAttribute("user");
            List<TotalHonor> totalHonors = totalHonorService.listBySchoolNumber(user.getUsername());
            return totalHonors;
        }
        return null;
    }
}
