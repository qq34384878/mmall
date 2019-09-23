package com.mmall.common;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/9/24 12:31 上午
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";

    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER = 0;  // 普通用户
        int ROLE_ADMIN = 1; // 管理员
    }
}
