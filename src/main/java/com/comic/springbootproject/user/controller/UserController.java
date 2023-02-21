package com.comic.springbootproject.user.controller;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.entity.User;
import com.comic.springbootproject.user.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     *URL: <a href="http://localhost/user/insertUser">...</a> ----post
     * @param {"userName":"lhj","password":"111111","email":"17990531116@qq.com","phone":17990531116}
     * @return result信息
     */
    @PostMapping(value = "/insertUser",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<User> insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
    @GetMapping(value = "/getUserById/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
