package com.comic.springbootproject.comment.controller;


import com.comic.springbootproject.comment.entity.Comment;
import com.comic.springbootproject.comment.service.CommentService;
import com.comic.springbootproject.common.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {


    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/api/comment/comments",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Comment> insertComment( Comment comment)
    {
        return commentService.insertComment(comment);
    }

    @DeleteMapping(value = "/api/comment/comments/{id}")
    public Result<Object> deleteCommentById(int id)
    {
        return commentService.deleteCommentById(id);
    }


}
