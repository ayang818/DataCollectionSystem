package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.honor.CompetitionHonorReceiveDTO;
import com.ayang818.honor.datacollection.dto.honor.PaperHonorReceiveDTO;
import com.ayang818.honor.datacollection.mapper.CompetitionHonorMapper;
import com.ayang818.honor.datacollection.mapper.PaperHonorMapper;
import com.ayang818.honor.datacollection.mapper.TotalHonorMapper;
import com.ayang818.honor.datacollection.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName HonorService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/27 15:46
 **/
@Service
public class HonorService {

    @Autowired
    private TotalHonorMapper totalHonorMapper;

    @Autowired
    private CompetitionHonorMapper competitionHonorMapper;

    @Autowired
    private PaperHonorMapper paperHonorMapper;

    public List<TotalHonor> listBySchoolNumber(Integer schoolNumber) {
        TotalHonorExample totalHonorExample = new TotalHonorExample();
        totalHonorExample.createCriteria().andSchoolNumberEqualTo(schoolNumber);
        return totalHonorMapper.selectByExample(totalHonorExample);
    }

    public List<TotalHonor> list() {
        return totalHonorMapper.selectByExample(new TotalHonorExample());
    }

    public void insertCompetitionHonor(User user, CompetitionHonorReceiveDTO receiveDTO) {
        CompetitionHonor competitionHonor = new CompetitionHonor();
        competitionHonor.setCompetitionLevel(receiveDTO.getCompetitionLevel());
        competitionHonor.setCompetitionName(receiveDTO.getCompetitionName());
        competitionHonor.setHonorLevel(receiveDTO.getHonorLevel());
        competitionHonor.setProve(null);
        competitionHonor.setTeacherName(receiveDTO.getTeacherName());
        // 待完成
        competitionHonor.setTeacherId(null);
        competitionHonor.setSchoolNumber(user.getUsername());
        competitionHonor.setStudentName(user.getStudentName());
        competitionHonor.setGmtCreate(new Date(System.currentTimeMillis()));
        competitionHonor.setGmtModified(competitionHonor.getGmtCreate());
        competitionHonor.setPass((byte) 1);
        competitionHonorMapper.insert(competitionHonor);
    }

    public void insertPaperHonor(User user, PaperHonorReceiveDTO receiveDTO) {
        PaperHonor paperHonor = new PaperHonor();
        paperHonor.setAuthorName(receiveDTO.getAuthorName());
        paperHonor.setAuthorOrder(receiveDTO.getAuthorOrder());
        paperHonor.setGmtCreate(new Date(System.currentTimeMillis()));
        paperHonor.setGmtModified(paperHonor.getGmtCreate());
        paperHonor.setPaperLevel(receiveDTO.getPaperLevel());
        paperHonor.setPaperTitle(receiveDTO.getPaperTitle());
        paperHonor.setPass((byte) 1);
        paperHonor.setPublishYear(receiveDTO.getPublishYear().getYear());
        paperHonor.setPublicationName(receiveDTO.getPublicationName());
        paperHonor.setTeacherName(receiveDTO.getTeacherName());
        paperHonor.setSchoolNumber(user.getUsername());
        paperHonor.setStudentName(user.getStudentName());
        // 上传证明
        paperHonor.setProve(null);
        paperHonorMapper.insert(paperHonor);
    }
}
