package com.comic.springbootproject.comment.service;

import com.comic.springbootproject.comment.entity.ComicComment;
import com.comic.springbootproject.common.vo.Result;

import java.util.List;

public interface ComicCommentService {
    //插入动漫评论
    Result<ComicComment> insertComicComment(ComicComment comicComment);
    //删除动漫评论
    Result<Object> deleteComicCommentByComicCommentId(int ComicCommentId);
    //查询所有动漫评论
    Result<List<ComicComment>> selectCommentByComicId(int comicId);


}
