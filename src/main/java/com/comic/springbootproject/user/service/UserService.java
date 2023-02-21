package com.comic.springbootproject.user.service;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.entity.User;

public interface UserService {
    Result<User> insertUser(User user);

    Result<User> updateUser(User user);

    Result<Object> deleteUser(int id);

    User getUserById(int id);
}
