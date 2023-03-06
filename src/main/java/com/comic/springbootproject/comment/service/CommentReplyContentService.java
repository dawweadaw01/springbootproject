package com.comic.springbootproject.comment.service;

import com.comic.springbootproject.comment.entity.ComicComment;
import com.comic.springbootproject.comment.entity.CommentReplyContent;
import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.common.vo.Search;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CommentReplyContentService {
    //得到二级回复
    List<CommentReplyContent> selectCommentReplyContentByComicCommentId(int ComicCommentId);
    //插入二级回复
    Result<CommentReplyContent> insertCommentReplyContent(CommentReplyContent commentReplyContent);
    //删除二级回复
    Result<Object> deleteCommentReplyContentByCommentReplyContentId(int commentReplyContentId);

}
