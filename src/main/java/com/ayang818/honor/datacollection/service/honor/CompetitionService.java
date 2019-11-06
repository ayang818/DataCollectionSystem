package com.ayang818.honor.datacollection.service.honor;

import com.ayang818.honor.datacollection.dto.excel.CompetitionExcelDTO;
import com.ayang818.honor.datacollection.dto.honor.CompetitionSearchDTO;
import com.ayang818.honor.datacollection.mapper.CompetitionHonorExtMapper;
import com.ayang818.honor.datacollection.mapper.CompetitionHonorMapper;
import com.ayang818.honor.datacollection.model.CompetitionHonor;
import com.ayang818.honor.datacollection.model.CompetitionHonorExample;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(CompetitionService.class);

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

    public List<CompetitionHonor> searchByKeyWord(CompetitionSearchDTO competitionSearchDTO) {
        List<CompetitionHonor> tempList = new ArrayList<>(32);
        CompetitionHonorExample studentNameExample = new CompetitionHonorExample();
        studentNameExample.createCriteria().andStudentNameLike("%" + competitionSearchDTO.getKeyword() + "%");
        tempList.addAll(competitionHonorMapper.selectByExample(studentNameExample));
        CompetitionHonorExample teacherNameExample = new CompetitionHonorExample();
        teacherNameExample.createCriteria().andGuidanceTeacherLike("%"+competitionSearchDTO.getKeyword()+"%");
        tempList.addAll(competitionHonorMapper.selectByExample(teacherNameExample));
        Integer num = 0;
        Integer limit = competitionSearchDTO.getLimit();
        Integer offset = competitionSearchDTO.getOffset();
        List<CompetitionHonor> resList = new ArrayList<>(limit);
        for (int i = 0; i < tempList.size(); i++) {
            if (i >= offset) {
                resList.add(tempList.get(i));
                num+=1;
            }
            if (num >= limit) {
                break;
            }
        }
        return resList;
    }

    public Long countByKeyword(String keyword) {
        Long res = 0L;
        CompetitionHonorExample teacherNameExample = new CompetitionHonorExample();
        teacherNameExample.createCriteria().andGuidanceTeacherLike("%"+keyword+"%");
        res += competitionHonorMapper.countByExample(teacherNameExample);
        if ("".equals(keyword)) {
            return res;
        }
        CompetitionHonorExample studentNameExample = new CompetitionHonorExample();
        studentNameExample.createCriteria().andStudentNameLike("%"+keyword+"%");
        res += competitionHonorMapper.countByExample(studentNameExample);
        return res;
    }
}
