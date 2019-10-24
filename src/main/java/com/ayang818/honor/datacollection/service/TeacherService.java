package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.excel.TeacherExcelDTO;
import com.ayang818.honor.datacollection.mapper.TeacherMapper;
import com.ayang818.honor.datacollection.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TeacherService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 17:56
 **/
@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public void insertAll(List<TeacherExcelDTO> list) {
        for (int i = 0; i < list.size(); i++) {
            Teacher teacher = new Teacher();
            TeacherExcelDTO entry = list.get(i);
            teacher.setName(entry.getName());
            teacher.setStudentNum(entry.getStudentNum());
            teacherMapper.insert(teacher);
        }
    }
}
