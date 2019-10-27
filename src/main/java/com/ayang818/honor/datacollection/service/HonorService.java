package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.honor.*;
import com.ayang818.honor.datacollection.mapper.*;
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

    @Autowired
    private KnowledgeHonorMapper knowledgeHonorMapper;

    @Autowired
    private AbilityHonorMapper abilityHonorMapper;

    @Autowired
    private GraduationMapper graduationMapper;

    @Autowired
    private CompetitionHonorExtMapper competitionExtHonorMapper;

    @Autowired
    private PaperHonorExtMapper paperHonorExtMapper;

    @Autowired
    private KnowledgeHonorExtMapper knowledgeHonorExtMapper;

    @Autowired
    private AbilityHonorExtMapper abilityHonorExtMapper;

    private static final Object LOCK = new Object();

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
        competitionExtHonorMapper.insertAndGetId(competitionHonor);
        TotalHonor totalHonor = new TotalHonor();
        totalHonor.setDetailId(competitionHonor.getId());
        totalHonor.setHonorName(receiveDTO.getCompetitionName() + " " + receiveDTO.getHonorLevel());
        totalHonor.setType(1);
        totalHonor.setPass((byte) 1);
        totalHonor.setSchoolNumber(user.getUsername());
        totalHonor.setStudentName(user.getStudentName());
        totalHonorMapper.insert(totalHonor);
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
        String[] yearString = receiveDTO.getPublishYear().toString().split(" ");
        paperHonor.setPublishYear(Integer.valueOf(yearString[yearString.length-1]));
        paperHonor.setPublicationName(receiveDTO.getPublicationName());
        paperHonor.setTeacherName(receiveDTO.getTeacherName());
        paperHonor.setSchoolNumber(user.getUsername());
        paperHonor.setStudentName(user.getStudentName());
        // 上传证明
        paperHonor.setProve(null);
        paperHonorMapper.insert(paperHonor);
        TotalHonor totalHonor = new TotalHonor();
        totalHonor.setDetailId(paperHonor.getId());
        totalHonor.setStudentName(user.getStudentName());
        totalHonor.setSchoolNumber(user.getUsername());
        totalHonor.setType(2);
        totalHonor.setPass((byte) 1);
        totalHonor.setHonorName(receiveDTO.getPaperTitle());
        totalHonorMapper.insert(totalHonor);
    }

    public void insertKnowledgeHonor(User user, KnowledgeHonorReceiveDTO receiveDTO) {
        KnowledgeHonor knowledgeHonor = new KnowledgeHonor();
        knowledgeHonor.setPass((byte) 1);
        knowledgeHonor.setHonorName(receiveDTO.getHonorName());
        knowledgeHonor.setHonorType(receiveDTO.getHonorType());
        knowledgeHonor.setAuthorizationStatus(receiveDTO.getAuthorizationStatus());
        knowledgeHonor.setRegisterNumber(receiveDTO.getRegisterNumber());
        knowledgeHonor.setSchoolNumber(user.getUsername());
        knowledgeHonor.setStudentName(user.getStudentName());
        knowledgeHonor.setGmtCreate(new Date(System.currentTimeMillis()));
        knowledgeHonor.setGmtModified(knowledgeHonor.getGmtCreate());
        knowledgeHonor.setTeacherName(receiveDTO.getTeacherName());
        // 上传证明
        knowledgeHonor.setProve(null);
        knowledgeHonorMapper.insert(knowledgeHonor);
        TotalHonor totalHonor = new TotalHonor();
        totalHonor.setDetailId(knowledgeHonor.getId());
        totalHonor.setStudentName(user.getStudentName());
        totalHonor.setSchoolNumber(user.getUsername());
        totalHonor.setType(3);
        totalHonor.setPass((byte) 1);
        totalHonor.setHonorName(receiveDTO.getHonorName());
        totalHonorMapper.insert(totalHonor);
    }


    public void insertAbilityHonor(User user, AbilityHonorReceiveDTO receiveDTO) {
        AbilityHonor abilityHonor = new AbilityHonor();
        abilityHonor.setPass((byte) 1);
        abilityHonor.setAbilityType(receiveDTO.getAbilityType());
        abilityHonor.setTeacherName(receiveDTO.getTeacherName());
        abilityHonor.setSchoolNumber(user.getUsername());
        abilityHonor.setStudentName(user.getStudentName());
        abilityHonor.setGmtCreate(new Date(System.currentTimeMillis()));
        abilityHonor.setGmtModified(abilityHonor.getGmtCreate());
        // 上传证明
        abilityHonor.setProve(null);
        abilityHonorMapper.insert(abilityHonor);
        TotalHonor totalHonor = new TotalHonor();
        totalHonor.setDetailId(abilityHonor.getId());
        totalHonor.setStudentName(user.getStudentName());
        totalHonor.setSchoolNumber(user.getUsername());
        totalHonor.setType(4);
        totalHonor.setPass((byte) 1);
        totalHonor.setHonorName(receiveDTO.getAbilityType());
        totalHonorMapper.insert(totalHonor);
    }

    public void insertGraduationHonor(User user, GraduationReceiveDTO receiveDTO) {
        Graduation graduation = new Graduation();
        graduation.setGonetype(receiveDTO.getGoneType());
        graduation.setWhereabouts(receiveDTO.getWhereabouts());
        graduation.setStudentName(user.getStudentName());
        graduation.setSchoolNumber(user.getUsername());
        graduation.setGmtCreate(new Date(System.currentTimeMillis()));
        graduation.setGmtModified(graduation.getGmtCreate());
        graduationMapper.insert(graduation);
    }
}
