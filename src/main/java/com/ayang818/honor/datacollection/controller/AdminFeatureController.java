package com.ayang818.honor.datacollection.controller;

import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.model.AbilityHonor;
import com.ayang818.honor.datacollection.model.CompetitionHonor;
import com.ayang818.honor.datacollection.model.KnowledgeHonor;
import com.ayang818.honor.datacollection.model.PaperHonor;
import com.ayang818.honor.datacollection.service.HonorService;
import com.ayang818.honor.datacollection.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AdminController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/28 18:55
 **/
@RestController
public class AdminFeatureController {
    @Autowired
    private HonorService honorService;

    @RequestMapping(value = "/api/honor/detail/competition/{id}", method = RequestMethod.GET)
    public CompetitionHonor getCompetitionHonorDetail(HttpServletRequest request, @PathVariable Long id) {
        return honorService.selectByCompetitionHonorId(id);
    }

    @RequestMapping(value = "/api/honor/detail/paper/{id}", method = RequestMethod.GET)
    public PaperHonor getPaperHonorDetail(HttpServletRequest request, @PathVariable Long id) {
        return honorService.selectByPaperHonorId(id);
    }

    @RequestMapping(value = "/api/honor/detail/knowledge/{id}", method = RequestMethod.GET)
    public KnowledgeHonor getKnowledgeHonorDetail(HttpServletRequest request, @PathVariable Long id) {
        return honorService.selectByKnowlegeHonorId(id);
    }

    @RequestMapping(value = "/api/honor/detail/ability/{id}", method = RequestMethod.GET)
    public AbilityHonor getAbilityHonorDetail(HttpServletRequest request, @PathVariable Long id) {
        return honorService.selectByAbilityHonorId(id);
    }

    @RequestMapping(value = "/api/honor/judge/competition/{id}", method = RequestMethod.GET)
    public String setCompetitionPassStatus(HttpServletRequest request, @PathVariable Long id, @RequestParam Integer status) {
        honorService.setCompetitionPassStatus(id, status);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }

    @RequestMapping(value = "/api/honor/judge/paper/{id}", method = RequestMethod.GET)
    public String setPaperPassStatus(HttpServletRequest request, @PathVariable Long id, @RequestParam Integer status) {
        honorService.setPaperPassStatus(id, status);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }

    @RequestMapping(value = "/api/honor/judge/knowledge/{id}", method = RequestMethod.GET)
    public String setKnowledgePassStatus(HttpServletRequest request, @PathVariable Long id, @RequestParam Integer status) {
        honorService.setKnowledgePassStatus(id, status);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }

    @RequestMapping(value = "/api/honor/judge/ability/{id}", method = RequestMethod.GET)
    public String setAbilityPassStatus(HttpServletRequest request, @PathVariable Long id, @RequestParam Integer status) {
        honorService.setAbilityPassStatus(id, status);
        return JSONUtil.parseEnumToJson(CustomizeResponseCode.SUCCESS);
    }
}
