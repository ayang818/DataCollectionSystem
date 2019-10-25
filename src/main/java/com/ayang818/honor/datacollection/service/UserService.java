package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.mapper.UserMapper;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/25 10:55
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String checkIfFirstLogin(Integer username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        return users != null ? users.get(0).getToken() : null;
    }

    public void insert(User user) {
        userMapper.insert(user);
    }
}
