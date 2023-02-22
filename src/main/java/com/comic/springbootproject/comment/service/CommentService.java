package com.comic.springbootproject.comment.service;

import com.comic.comicsystem.comment.entity.Comment;
import com.comic.comicsystem.common.vo.Result;

public interface CommentService {

    Result<Comment> insertComment(Comment comment);

    Result<Object> deleteCommentById(int id);
}
