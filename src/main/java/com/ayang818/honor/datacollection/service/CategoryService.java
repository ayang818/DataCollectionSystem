package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.mapper.CategoryExtMapper;
import com.ayang818.honor.datacollection.mapper.CategoryMapper;
import com.ayang818.honor.datacollection.mapper.ClosureTableExtMapper;
import com.ayang818.honor.datacollection.mapper.ClosureTableMapper;
import com.ayang818.honor.datacollection.model.Category;
import com.ayang818.honor.datacollection.model.CategoryExample;
import com.ayang818.honor.datacollection.model.ClosureTable;
import com.ayang818.honor.datacollection.model.ClosureTableExample;
import io.swagger.annotations.Example;
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

    @Autowired
    private CategoryExtMapper categoryExtMapper;

    @Autowired
    private ClosureTableExtMapper closureTableExtMapper;

    public void insertNode(Long parentId, String value) {
        List<Category> categories = categoryMapper.selectByExample(new CategoryExample());
        if (categories.size() == 0) {
            Category category = new Category();
            category.setTitle(null);
            categoryMapper.insert(category);
            ClosureTable record = new ClosureTable();
            record.setAncestor(0L);
            record.setDescendant(0L);
            record.setDistance(0L);
            closureTableMapper.insert(record);
        }
        Category category = new Category();
        category.setTitle(value);
        categoryExtMapper.insertAndGetId(category);
        Long selfId = category.getId();
        ClosureTableExample example = new ClosureTableExample();
        example.createCriteria().andAncestorEqualTo(parentId);
        List<ClosureTable> parentsTrace = closureTableMapper.selectByExample(example);
        List<ClosureTable> descendantTrace = new ArrayList<>(16);
        for (int i = 0; i < parentsTrace.size(); i++) {
            ClosureTable closureTable = parentsTrace.get(i);
            closureTable.setDescendant(selfId);
            closureTable.setDistance(closureTable.getDistance() + 1);
            descendantTrace.add(closureTable);
        }
        ClosureTable self = new ClosureTable();
        self.setAncestor(selfId);
        self.setDescendant(selfId);
        self.setDistance(0L);
        descendantTrace.add(self);
        for (ClosureTable closureTable : descendantTrace) {
            closureTableMapper.insert(closureTable);
        }
    }

    public void deleteNode(Long id) {
        ClosureTableExample example = new ClosureTableExample();
        example.createCriteria().andDescendantEqualTo(id);
        closureTableMapper.deleteByExample(example);
        categoryMapper.deleteByPrimaryKey(id);
    }

    public void updateNodeValue(Long parentId, String value) {

    }

    public List<Category> queryNode(Long parentId) {
        List<ClosureTable> closureTables = closureTableExtMapper.queryDescendant(parentId);
        List<Category> categoryList = new ArrayList<>();
        for (ClosureTable closureTable : closureTables) {
            Category category = categoryMapper.selectByPrimaryKey(closureTable.getDescendant());
            categoryList.add(category);
        }
        return  categoryList;
    }

    public String queryParentName(Long id) {
        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category != null) {
            return category.getTitle();
        }
        return null;
    }
}
