package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.login.LoginDTO;
import com.ayang818.honor.datacollection.mapper.StudentMapper;
import com.ayang818.honor.datacollection.model.Student;
import com.ayang818.honor.datacollection.model.StudentExample;
import com.ayang818.honor.datacollection.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName RegisterService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 21:40
 **/
@Service
public class RegisterService {
    @Autowired
    private StudentMapper studentMapper;

    public Student checkIfUserExists(LoginDTO loginDTO) {
        StudentExample example = new StudentExample();
        example.createCriteria().andSchoolNumberEqualTo(loginDTO.getUsername());
        List<Student> students = studentMapper.selectByExample(example);
        return students!=null && students.size()>0 ? students.get(0) : null;
    }

}
