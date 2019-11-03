package com.ayang818.honor.datacollection.interceptor;

import com.ayang818.honor.datacollection.enumdata.UserDataEnum;
import com.ayang818.honor.datacollection.mapper.AdminMapper;
import com.ayang818.honor.datacollection.mapper.UserMapper;
import com.ayang818.honor.datacollection.model.Admin;
import com.ayang818.honor.datacollection.model.AdminExample;
import com.ayang818.honor.datacollection.model.User;
import com.ayang818.honor.datacollection.model.UserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName SessionInterceptor
 * @Dessription TODO
 * @Author 杨丰畅
 * @Date 2019/10/25 21:09
 **/
@Component
public class SessionInterceptor implements HandlerInterceptor {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private  AdminMapper adminMapper;

    @Value("${url.frontend.login.user.api}")
    private String userLoginApi;

    @Value("${url.frontend.login.admin.api}")
    private String adminLoginApi;

    private static final Logger LOGGER = LoggerFactory.getLogger(SessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String requestURL = request.getRequestURI();
        if (userLoginApi.equals(requestURL) || adminLoginApi.equals(requestURL)) {
            return true;
        }

        String authorization = request.getHeader("Authorization");
        if (authorization == null) {
            return false;
        }
        String[] tokenList = authorization.split(" ");
        if (tokenList.length < 2) {
            return false;
        }
        String token = tokenList[1];
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andTokenEqualTo(token);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() == 1) {
            request.getSession().setAttribute("user", admins.get(0));
            request.getSession().setAttribute("type", UserDataEnum.ADMINTYPE);
            return true;
        }
        UserExample example = new UserExample();
        example.createCriteria().andTokenEqualTo(token);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() == 0) {
            return false;
        }
        request.getSession().setAttribute("user", users.get(0));
        request.getSession().setAttribute("type", UserDataEnum.USERTYPE);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

}