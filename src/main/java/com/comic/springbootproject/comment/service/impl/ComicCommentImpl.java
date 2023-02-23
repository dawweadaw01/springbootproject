package com.comic.springbootproject.comment.service.impl;

import com.comic.springbootproject.comment.dao.ComicCommentDao;
import com.comic.springbootproject.comment.entity.ComicComment;
import com.comic.springbootproject.comment.entity.Comment;
import com.comic.springbootproject.comment.entity.CommentReplyContent;
import com.comic.springbootproject.comment.service.ComicCommentService;
import com.comic.springbootproject.comment.service.CommentReplyContentService;
import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.dao.UserDao;
import com.comic.springbootproject.user.entity.User;
import com.comic.springbootproject.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ComicCommentImpl implements ComicCommentService {
    @Resource
    private ComicCommentDao comicCommentDao;
    @Resource
    private CommentReplyContentService commentReplyContentService;

    @Resource
    private UserDao userDao;

    @Override
    @Transactional
    public Result<ComicComment> insertComicComment(ComicComment comicComment) {
        String time = new Date().getTime() + "";
        comicComment.setCreateTime(time);
        Comment comment = new Comment();
        comment.setComment(comicComment.getComment());
        comicCommentDao.insertComment(comment);
        comicComment.setCommentId(comment.getId());
        comicCommentDao.insertComicComment(comicComment);
        return Result.ok("评论成功，注意评论规范", comicComment);
    }

    @Override
    @Transactional
    public Result<Object> deleteComicCommentByComicCommentId(int ComicCommentId) {
        ComicComment comicComment = comicCommentDao.selectComicCommentByComicCommentId
                (ComicCommentId);
        if (comicComment.getCommentId() != 0) {
            comicCommentDao.deleteCommentByCommentId(comicComment.getCommentId());
        }
        comicCommentDao.deleteComicCommentByComicCommentId(ComicCommentId);
        return Result.ok("删除评论成功");
    }

    @Override
    @Transactional
    public Result<List<ComicComment>> selectCommentByComicId(int comicId) {

        List<ComicComment> comicCommentList = comicCommentDao.selectCommentByComicId(comicId);
        SimpleDateFormat sdfDatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //遍历评论列表，将评论id转换为评论内容
        for (ComicComment comicComment : comicCommentList) {
            Comment comment = comicCommentDao.selectCommentByCommentId(comicComment.getCommentId());
            comicComment.setComment(comment.getComment());
            comicComment.setCreateTime(sdfDatetime.format(Long.parseLong(comicComment.getCreateTime())));
            User user1 = userDao.getUserById(comicComment.getUserId());
            comicComment.setUserName(user1.getUserName());
            comicComment.setAvatar(user1.getAvatar());
            List<CommentReplyContent> commentReplyContents = commentReplyContentService.
                    selectCommentReplyContentByComicCommentId(comicComment.getId());
            comicComment.setCommentReplyContentList(commentReplyContents);
        }
        return Result.ok("一级评论查询成功",comicCommentList);
    }
}
