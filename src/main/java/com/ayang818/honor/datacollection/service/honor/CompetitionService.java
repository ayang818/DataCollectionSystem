package com.ayang818.honor.datacollection.service.honor;

import com.ayang818.honor.datacollection.dto.excel.CompetitionExcelDTO;
import com.ayang818.honor.datacollection.mapper.CompetitionHonorExtMapper;
import com.ayang818.honor.datacollection.mapper.CompetitionHonorMapper;
import com.ayang818.honor.datacollection.model.CompetitionHonor;
import com.ayang818.honor.datacollection.model.CompetitionHonorExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName CompetitionService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/11/4 15:40
 **/
@Service
public class CompetitionService {
    @Autowired
    private CompetitionHonorMapper competitionHonorMapper;

    @Autowired
    private CompetitionHonorExtMapper competitionExtHonorMapper;

    public void insertCompetitionHonorFromExcel(List<CompetitionExcelDTO> list) {
        List<CompetitionHonor> tempList = new ArrayList<>(300);
        Date gmtCreate = new Date(System.currentTimeMillis());
        for (CompetitionExcelDTO competitionExcelDTO : list) {
            CompetitionHonor competitionHonor = new CompetitionHonor();
            BeanUtils.copyProperties(competitionExcelDTO, competitionHonor);
            competitionHonor.setPass((byte) 2);
            competitionHonor.setGmtCreate(gmtCreate);
            competitionHonor.setGmtModified(gmtCreate);
            tempList.add(competitionHonor);
        }
        competitionExtHonorMapper.insertList(tempList);
    }

    public List<CompetitionHonor> list(Integer limit, Integer offset) {
        return competitionHonorMapper.selectByExampleWithRowbounds(new CompetitionHonorExample(), new RowBounds(offset, limit));
    }

    public Long count() {
        return competitionHonorMapper.countByExample(new CompetitionHonorExample());
    }
}
