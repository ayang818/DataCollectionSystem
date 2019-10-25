package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.excel.StudentExcelDTO;
import com.ayang818.honor.datacollection.mapper.StudentMapper;
import com.ayang818.honor.datacollection.model.Student;
import com.ayang818.honor.datacollection.model.StudentExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @ClassName StudentService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 17:56
 **/
@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public void insertAll(List<StudentExcelDTO> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = new Student();
            StudentExcelDTO entry = (StudentExcelDTO) list.get(i);
            if (entry != null) {
                BeanUtils.copyProperties(entry, student);
                student.setStudentName(entry.getName());
                student.setSex((byte) (Objects.equals(entry.getSex(), "男") ? 1 : 0));
                studentMapper.insert(student);
            }
        }
    }
}
