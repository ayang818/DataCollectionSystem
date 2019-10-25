package com.ayang818.honor.datacollection.dto.login;

import lombok.Data;

/**
 * @ClassName LoginSuccessDTO
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/25 11:08
 **/
@Data
public class LoginSuccessDTO {
    private String token;
    private Integer code;
    private String message;
}
