package com.comic.springbootproject.user.dao;

import com.comic.springbootproject.user.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    @Insert("insert into user_table (userName,password,avatar,email,phone,createTime) " +
            "values (#{userName}, #{password},#{avatar},#{email},#{phone},#{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertUser(User user);

    @Select("select * from user_table where userName = #{userName}")
    User getUserByName(String userName);
    @Update("update user_table set userName = #{userName}, password = #{password}," +
            "avatar=#{avatar}, email=#{email}, phone=#{phone}, createTime = #{createTime} where id = #{id}")
    void updateUser(User user);

    @Delete("delete from user_table where id = #{id}")
    void deleteUser(int id);
    @Select("select * from user_table where id = #{id}")
    User getUserById(int id);
}


