package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by fangyu on 2019/9/23.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
