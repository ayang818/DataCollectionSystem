package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.login.LoginDTO;
import com.ayang818.honor.datacollection.dto.user.EditProfileReceiveDTO;
import com.ayang818.honor.datacollection.exception.CustomizeException;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.mapper.UserMapper;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    public String checkIfFirstLogin(LoginDTO loginDTO) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(loginDTO.getUsername());
        List<User> users = userMapper.selectByExample(example);
        if (users != null && users.size() > 0) {
            if (users.get(0).getPassword().equals(loginDTO.getPassword())) {
                return users.get(0).getToken();
            }
            else {
                throw new CustomizeException(CustomizeResponseCode.PASSWORD_ERROR);
            }
        }
        return null;
    }

    public void insert(User user) {
        userMapper.insert(user);
    }

    public void updateUserPassword(User user, EditProfileReceiveDTO receiveDTO) {
        user.setPassword(receiveDTO.getPassword());
        user.setToken(UUID.randomUUID().toString());
        userMapper.updateByPrimaryKey(user);
    }
}
