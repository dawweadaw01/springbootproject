package com.comic.springbootproject.comment.service.impl;


import com.comic.springbootproject.comment.dao.CommentDao;
import com.comic.springbootproject.comment.entity.Comment;
import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;


    @Override
    public Result<Comment> insertComment(Comment comment) {
        // 通过comicId寻找
        comment.setUserId(comment.getUserId());
        comment.setComicId(comment.getComicId());
        comment.setOtherId(comment.getOtherId());
        comment.setComment(comment.getComment());
        comment.setCreateTime(LocalDateTime.now());
        comment.setUpdateTime(LocalDateTime.now());

        // insert
        commentDao.insertComment(comment);


        return Result.ok(comment);
    }

    @Override
    public Result<Object> deleteCommentById(int id) {
        commentDao.deleteCommentById(id);
        return Result.ok();
    }
}
