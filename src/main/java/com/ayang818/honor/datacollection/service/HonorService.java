package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.honor.*;
import com.ayang818.honor.datacollection.enumdata.HonorTypeEnum;
import com.ayang818.honor.datacollection.exception.CustomizeException;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
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
        paperHonorExtMapper.insertAndGetId(paperHonor);
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
        knowledgeHonorExtMapper.insertAndGetId(knowledgeHonor);
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
        abilityHonorExtMapper.insertAndGetId(abilityHonor);
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

    public CompetitionHonor selectByCompetitionHonorId(Long id) {
        return competitionHonorMapper.selectByPrimaryKey(id);
    }

    public PaperHonor selectByPaperHonorId(Long id) {
        return paperHonorMapper.selectByPrimaryKey(id);
    }

    public KnowledgeHonor selectByKnowlegeHonorId(Long id) {
        return knowledgeHonorMapper.selectByPrimaryKey(id);
    }

    public AbilityHonor selectByAbilityHonorId(Long id) {
        return abilityHonorMapper.selectByPrimaryKey(id);
    }

    public Boolean updateTotalPassStatus(Long id, int status, Integer type) {
        TotalHonorExample example = new TotalHonorExample();
        example.createCriteria().andDetailIdEqualTo(id).andTypeEqualTo(type);
        List<TotalHonor> totalHonors = totalHonorMapper.selectByExample(example);
        if (totalHonors.size() >= 1) {
            TotalHonor record = totalHonors.get(0);
            record.setPass((byte) status);
            totalHonorMapper.updateByPrimaryKey(record);
            return true;
        }
        throw new CustomizeException(CustomizeResponseCode.NO_SUCH_RECORD);
    }

    public void setCompetitionPassStatus(Long id, int status) {
        CompetitionHonor competitionHonor = competitionHonorMapper.selectByPrimaryKey(id);
        competitionHonor.setPass((byte) status);
        competitionHonorMapper.updateByPrimaryKey(competitionHonor);
        updateTotalPassStatus(id, status, HonorTypeEnum.COMPETITION_TYPE);
    }

    public void setPaperPassStatus(Long id, int status) {
        PaperHonor paperHonor = paperHonorMapper.selectByPrimaryKey(id);
        paperHonor.setPass((byte) status);
        paperHonorMapper.updateByPrimaryKey(paperHonor);
        updateTotalPassStatus(id, status, HonorTypeEnum.PAPER_TYPE);
    }

    public void setKnowledgePassStatus(Long id, int status) {
        KnowledgeHonor knowledgeHonor = knowledgeHonorMapper.selectByPrimaryKey(id);
        knowledgeHonor.setPass((byte) status);
        knowledgeHonorMapper.updateByPrimaryKey(knowledgeHonor);
        updateTotalPassStatus(id, status, HonorTypeEnum.KNOWLEDGE_TYPE);
    }


    public void setAbilityPassStatus(Long id, int status) {
        AbilityHonor abilityHonor = abilityHonorMapper.selectByPrimaryKey(id);
        abilityHonor.setPass((byte) status);
        abilityHonorMapper.updateByPrimaryKey(abilityHonor);
        updateTotalPassStatus(id, status, HonorTypeEnum.ABILITY_TYPE);
    }
}
