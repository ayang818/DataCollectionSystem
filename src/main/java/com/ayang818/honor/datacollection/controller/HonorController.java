package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.dto.honor.CompetitionHonorReceiveDTO;
import com.ayang818.honor.datacollection.dto.honor.PaperHonorReceiveDTO;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.exception.ICustomizeResponseCode;
import com.ayang818.honor.datacollection.model.Admin;
import com.ayang818.honor.datacollection.model.TotalHonor;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.service.HonorService;
import com.ayang818.honor.datacollection.util.GetUserTypeUtil;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    private HonorService honorService;

    @RequestMapping(value = "/api/honor/competition", method = RequestMethod.POST)
    public ICustomizeResponseCode createOrUpdateCompetitionHonor(HttpServletRequest request) {
        return null;
    }

    @RequestMapping(value = "/api/honor/list", method = RequestMethod.GET)
    public List<TotalHonor> listSubmittedHonorAsUser(HttpServletRequest request) {
        User user = GetUserTypeUtil.getUser(request);
        return honorService.listBySchoolNumber(user.getUsername());
    }

    @RequestMapping(value = "/api/honor/admin/list", method = RequestMethod.GET)
    public List<TotalHonor> listSubmittedHonorAsAdmin(HttpServletRequest request) {
        Admin admin = GetUserTypeUtil.getAdmin(request);
        return honorService.list();
    }

    @RequestMapping(value = "/api/honor/edit/competition", method = RequestMethod.POST)
    public String editCompetitionHonor(@RequestBody CompetitionHonorReceiveDTO receiveDTO, HttpServletRequest request) {
        User user = GetUserTypeUtil.getUser(request);
        honorService.insertCompetitionHonor(user, receiveDTO);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }

    @RequestMapping(value = "/api/honor/edit/paper", method = RequestMethod.POST)
    public String editPaperHonor(@RequestBody PaperHonorReceiveDTO receiveDTO, HttpServletRequest request) {
        User user = GetUserTypeUtil.getUser(request);
        honorService.insertPaperHonor(user, receiveDTO);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }
}
