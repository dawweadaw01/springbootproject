package com.comic.springbootproject.user.service;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.entity.UserCollection;
import com.comic.springbootproject.user.entity.UserHistory;

import java.util.List;

public interface UserRecordService {
    Result<Object> insertHistory(UserHistory userHistory);
    // TODO : 根据用户id查找历史记录
    Result<Object> selectComicByHistory(int id);
    // TODO : 根据用户id查找收藏记录
    Result<Object> selectComicByCollection(int id);
    Result<UserCollection> insertCollection(UserCollection userCollection);

    Result<Object> deleteCollection(UserCollection userCollection);
    //Result<UserCollection> updateCollection(UserCollection userCollection);

}
