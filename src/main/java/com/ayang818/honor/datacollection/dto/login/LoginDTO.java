package com.ayang818.honor.datacollection.dto.login;

import lombok.Data;

/**
 * @ClassName LoginDTO
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/24 10:48
 **/
@Data
public class LoginDTO {
    private Integer username;
    private String password;
    private String type;
}
