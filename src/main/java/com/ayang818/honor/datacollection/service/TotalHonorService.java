package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.mapper.TotalHonorMapper;
import com.ayang818.honor.datacollection.model.TotalHonor;
import com.ayang818.honor.datacollection.model.TotalHonorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TotalHonorService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/26 21:38
 **/
@Service
public class TotalHonorService {
    @Autowired
    private TotalHonorMapper totalHonorMapper;

    public List<TotalHonor> listBySchoolNumber(Integer schoolNumber) {
        TotalHonorExample totalHonorExample = new TotalHonorExample();
        totalHonorExample.createCriteria().andSchoolNumberEqualTo(schoolNumber);
        List<TotalHonor> totalHonors = totalHonorMapper.selectByExample(totalHonorExample);
        return totalHonors;
    }
}
