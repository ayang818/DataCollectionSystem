package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.mapper.CategoryMapper;
import com.ayang818.honor.datacollection.mapper.ClosureTableMapper;
import com.ayang818.honor.datacollection.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ClosureTableMapper closureTableMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    static {
        List<Category> categoryList = new ArrayList<>();
        Category e = new Category();
        categoryList.add(e);
    }

    public void insertNode(Long parentId, String value) {

    }

    public void deleteNode(Long parentId, String value) {

    }

    public void updateNode(Long parentId, String value) {

    }

    public void queryNode(Long parentId, String value) {

    }
}
