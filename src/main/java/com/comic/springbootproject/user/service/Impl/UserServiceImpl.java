package com.comic.springbootproject.user.service.Impl;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.dao.UserDao;
import com.comic.springbootproject.user.entity.User;
import com.comic.springbootproject.user.service.UserService;
import com.comic.springbootproject.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.Date;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    @Transactional
    public Result<User> insertUser(User user) {
        //  根据用户名字查找用户是否存在
        User temp = userDao.getUserByName(user.getUserName());
        //  如果存在返回错误信息
        if(temp != null) {
            return Result.failed("用户名已存在");
        }
        //初始化user属性
        user.setCreateTime(new Date().getTime());
        user.setPassword(MD5Util.getMD5(user.getPassword()));
        userDao.insertUser(user);
        return Result.ok(user);
    }

    @Override
    @Transactional
    public Result<User> updateUser(User user) {
        User temp = userDao.getUserByName(user.getUserName());
        //  如果存在返回错误信息
        if(temp != null && temp.getId() != user.getId()) {
            return Result.failed("用户名已存在");
        }
        //初始化user属性
        user.setCreateTime(new Date().getTime());
        user.setPassword(MD5Util.getMD5(user.getPassword()));
        userDao.insertUser(user);
        return Result.ok(user);
    }

    @Override
    @Transactional
    public Result<Object> deleteUser(int id) {
        userDao.deleteUser(id);
        return Result.ok();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
