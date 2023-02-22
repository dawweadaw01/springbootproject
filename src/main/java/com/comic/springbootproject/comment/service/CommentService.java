package com.comic.springbootproject.comment.service;

import com.comic.springbootproject.comment.entity.Comment;
import com.comic.springbootproject.common.vo.Result;

public interface CommentService {

    Result<Comment> insertComment(Comment comment);

    Result<Object> deleteCommentById(int id);
}
