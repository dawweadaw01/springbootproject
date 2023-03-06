package com.comic.springbootproject.user.service;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.common.vo.Search;
import com.comic.springbootproject.user.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    //插入用户
    Result<User> insertUser(User user);
    //更新用户
    Result<User> updateUser(User user);
    //删除用户
    Result<Object> deleteUser(int id);
    //得到用户
    User getUserById(int id);
    //登录
    Result<User> login(User user);
    //设置为管理
    Result<User> setAdmin(int id);
    //分页查用户
    PageInfo<User> getUserBySearch(Search search);


}
