package com.imooc.service;

import com.imooc.pojo.Stu;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface UserService {
    //判断用户名是否存在
    public boolean queryUserNameIsExist(String username);
    //前端传过来的都可以定义为XXXBO
    //创建用户
    public Users createUser(UserBO userBO);
    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);
}
