package com.comic.springbootproject.comment.service;

import com.comic.springbootproject.comment.entity.ComicComment;
import com.comic.springbootproject.common.vo.Result;

import java.util.List;

public interface ComicCommentService {
    Result<ComicComment> insertComicComment(ComicComment comicComment);

    Result<Object> deleteComicCommentByComicCommentId(int ComicCommentId);

    List<ComicComment> selectCommentByComicId(int comicId);

}
