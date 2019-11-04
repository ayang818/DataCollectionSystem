package com.ayang818.honor.datacollection.service;

import com.ayang818.honor.datacollection.dto.login.LoginDTO;
import com.ayang818.honor.datacollection.dto.user.EditProfileReceiveDTO;
import com.ayang818.honor.datacollection.exception.CustomizeException;
import com.ayang818.honor.datacollection.exception.CustomizeResponseCode;
import com.ayang818.honor.datacollection.mapper.AdminMapper;
import com.ayang818.honor.datacollection.model.Admin;
import com.ayang818.honor.datacollection.model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AdminService
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/27 13:09
 **/
@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public String checkIfExists(LoginDTO loginDTO) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(loginDTO.getUsername());
        List<Admin> admins = adminMapper.selectByExample(example);
        if (admins != null && admins.size() > 0) {
            if (admins.get(0).getPassword().equals(loginDTO.getPassword())) {
                return admins.get(0).getToken();
            } else {
                throw new CustomizeException(CustomizeResponseCode.PASSWORD_ERROR);
            }
        }
        throw new CustomizeException(CustomizeResponseCode.NOT_ADMIN);
    }

    public void updateUserPassword(Admin admin, EditProfileReceiveDTO receiveDTO) {
        admin.setPassword(receiveDTO.getPassword());
        adminMapper.updateByPrimaryKey(admin);
    }
}
