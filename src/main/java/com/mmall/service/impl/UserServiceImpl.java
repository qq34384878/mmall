package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/9/23 11:34 下午
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        //TODO 密码登录MD5

        User user = userMapper.selectLogin(username, password);
        if (user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }

        // 设置密码为空，这样json序列号不会暴露密码
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", user);
    }
}
