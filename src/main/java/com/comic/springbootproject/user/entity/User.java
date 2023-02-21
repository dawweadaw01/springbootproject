package com.comic.springbootproject.user.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private String avatar;
    private String email;
    private String phone;
    private long createTime;

    public User() {
    }

    public User(int id, String userName, String password, String avatar, String email, String phone, long createTime) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.avatar = avatar;
        this.email = email;
        this.phone = phone;
        this.createTime = createTime;
    }
}
