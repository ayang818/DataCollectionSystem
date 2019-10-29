package com.ayang818.honor.datacollection.controller;


import com.ayang818.honor.datacollection.model.Category;
import com.ayang818.honor.datacollection.service.CategoryService;
import com.ayang818.honor.datacollection.util.GetUserTypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/api/categories/competition", method = RequestMethod.GET)
    public ConcurrentHashMap<String, List> getCompetitionItem(HttpServletRequest request) {
        GetUserTypeUtil.getUser(request);
        return categoryService.getCompetitionItem();
    }

}
