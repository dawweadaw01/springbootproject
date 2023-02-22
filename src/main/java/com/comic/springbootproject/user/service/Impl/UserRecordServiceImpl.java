package com.comic.springbootproject.user.service.Impl;

import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.dao.UserRecord;
import com.comic.springbootproject.user.entity.UserCollection;
import com.comic.springbootproject.user.entity.UserHistory;
import com.comic.springbootproject.user.service.UserRecordService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class UserRecordServiceImpl implements UserRecordService {
    @Resource
    private UserRecord userRecord;

    @Override
    @Transactional
    public Result<Object> insertHistory(UserHistory userHistory) {
        userHistory.setCreateTime(new Date().getTime()+"");
        if(userRecord.selectHistory(userHistory) != null){
            userRecord.updateHistory(userHistory);
        }else{
            userRecord.insertHistory(userHistory);
        }
        return Result.ok("添加成功");
    }

    @Override
    @Transactional
    public Result<Object> selectComicByHistory(int id) {
        List<Integer> list = userRecord.selectHistoryByUserId(id);
        // TODO : 设置List<Comic> comicHistory = new ArrayList<>();
        // TODO : for(int i = 0; i < list.size(); i++){
        // TODO :     comicList.add(comicService.'得到动漫的函数'(list.get(i)));
        // TODO : }
        // TODO : return Result.ok(comicHistory);
        //等待动漫id的查询
        return null;

    }

    @Override
    @Transactional
    public Result<Object> selectComicByCollection(int id) {
        List<Integer> list = userRecord.selectCollectionByUserId(id);
        // TODO : 设置List<Comic> comicCollection = new ArrayList<>();
        // TODO : for(int i = 0; i < list.size(); i++){
        // TODO :     comicList.add(comicService.'得到动漫的函数'(list.get(i)));
        // TODO : }
        // TODO : return Result.ok(comicCollection);
        return null;
    }

    @Override
    @Transactional
    public Result<UserCollection> insertCollection(UserCollection userCollection) {
        if(userRecord.selectCollection(userCollection) != null){
            return Result.failed("已经收藏过了");
        }else{
            userRecord.insertCollection(userCollection);
            return Result.ok();
        }
    }

    @Override
    @Transactional
    public Result<Object> deleteCollection(UserCollection userCollection) {
        userRecord.deleteCollection(userCollection);
        return Result.ok();
    }

}
