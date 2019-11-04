package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.dto.honor.*;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.exception.ICustomizeResponseCode;
import com.ayang818.honor.datacollection.model.*;
import com.ayang818.honor.datacollection.service.HonorService;
import com.ayang818.honor.datacollection.util.GetUserTypeUtil;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName HonorController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/26 13:23
 **/

@Deprecated
@RestController
public class HonorController {

    @Autowired
    private HonorService honorService;

//    @RequestMapping(value = "/api/honor/competition", method = RequestMethod.POST)
//    public ICustomizeResponseCode createOrUpdateCompetitionHonor(HttpServletRequest request) {
//        return null;
//    }
//
//    @RequestMapping(value = "/api/honor/list", method = RequestMethod.GET)
//    public List<TotalHonor> listSubmittedHonorAsUser(HttpServletRequest request) {
//        User user = GetUserTypeUtil.getUser(request);
//        return honorService.listBySchoolNumber(user.getUsername());
//    }
//
//    @RequestMapping(value = "/api/honor/admin/list", method = RequestMethod.GET)
//    public List<TotalHonor> listSubmittedHonorAsAdmin(HttpServletRequest request) {
//        Admin admin = GetUserTypeUtil.getAdmin(request);
//        return honorService.list();
//    }
//
//    @RequestMapping(value = "/api/honor/edit/competition", method = RequestMethod.POST)
//    public String editCompetitionHonor(@RequestBody CompetitionHonorReceiveDTO receiveDTO, HttpServletRequest request, @RequestParam(value = "id", required = false) Long id) {
//        User user = GetUserTypeUtil.getUser(request);
//        honorService.insertOrUpdateCompetitionHonor(user, receiveDTO, id);
//        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
//    }
//
//    @RequestMapping(value = "/api/honor/edit/paper", method = RequestMethod.POST)
//    public String editPaperHonor(@RequestBody PaperHonorReceiveDTO receiveDTO, HttpServletRequest request, @RequestParam(value = "id", required = false) Long id) {
//        User user = GetUserTypeUtil.getUser(request);
//        honorService.insertOrUpdatePaperHonor(user, receiveDTO, id);
//        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
//    }
//
//    @RequestMapping(value = "/api/honor/edit/knowledge", method = RequestMethod.POST)
//    public String editKnowledgeHonor(@RequestBody KnowledgeHonorReceiveDTO receiveDTO, HttpServletRequest request, @RequestParam(value = "id", required = false) Long id) {
//        User user = GetUserTypeUtil.getUser(request);
//        honorService.insertOrUpdateKnowledgeHonor(user, receiveDTO, id);
//        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
//    }
//
//    @RequestMapping(value = "/api/honor/edit/ability", method = RequestMethod.POST)
//    public String editKnowledgeHonor(@RequestBody AbilityHonorReceiveDTO receiveDTO, HttpServletRequest request, @RequestParam(value = "id", required = false) Long id) {
//        User user = GetUserTypeUtil.getUser(request);
//        honorService.insertOrUpdateAbilityHonor(user, receiveDTO, id);
//        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
//    }
//
//    @RequestMapping(value = "/api/honor/edit/graduation", method = RequestMethod.POST)
//    public String editKnowledgeHonor(@RequestBody GraduationReceiveDTO receiveDTO, HttpServletRequest request) {
//        User user = GetUserTypeUtil.getUser(request);
//        honorService.insertGraduationHonor(user, receiveDTO);
//        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
//    }
}
