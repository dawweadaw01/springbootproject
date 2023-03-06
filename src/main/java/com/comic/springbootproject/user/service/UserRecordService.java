package com.comic.springbootproject.user.service;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.entity.UserCollection;
import com.comic.springbootproject.user.entity.UserHistory;

import java.util.List;

public interface UserRecordService {
    //插入历史记录
    Result<Object> insertHistory(UserHistory userHistory);
    //得到历史记录
    Result<Object> selectHistoryByUserId(int id);
    //得到收藏
    Result<Object> selectCollectionByUserId(int id);
    //插入收藏
    Result<UserCollection> insertCollection(UserCollection userCollection);
    //删除收藏
    Result<Object> deleteCollection(UserCollection userCollection);
    //Result<UserCollection> updateCollection(UserCollection userCollection);

}
