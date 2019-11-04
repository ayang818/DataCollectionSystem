package com.ayang818.honor.datacollection.controller.honor;

import com.ayang818.honor.datacollection.model.CompetitionHonor;
import com.ayang818.honor.datacollection.service.honor.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName CompetitionController
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/11/4 15:31
 **/
@RestController
public class CompetitionController {
    @Autowired
    private CompetitionService competitionService;

    @RequestMapping(value = "/api/admin/honor/competition/list", method = RequestMethod.GET)
    public List<CompetitionHonor> list(@RequestParam(value = "limit") Integer limit, @RequestParam(value = "offset") Integer offset) {
        return competitionService.list(limit, offset);
    }

    @RequestMapping(value = "/api/admin/honor/competition/count", method = RequestMethod.GET)
    public Long count() {
        Long count = competitionService.count();
        return count;
    }
}
