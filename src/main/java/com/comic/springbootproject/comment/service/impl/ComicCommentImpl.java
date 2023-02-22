package com.comic.springbootproject.comment.service.impl;

import com.comic.springbootproject.comment.dao.ComicCommentDao;
import com.comic.springbootproject.comment.entity.ComicComment;
import com.comic.springbootproject.comment.entity.Comment;
import com.comic.springbootproject.comment.service.ComicCommentService;
import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.user.service.UserService;
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
    private UserService userService;

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
    public List<ComicComment> selectCommentByComicId(int comicId) {

        List<ComicComment> comicCommentList = comicCommentDao.selectCommentByComicId(comicId);
        SimpleDateFormat sdfDatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //遍历评论列表，将评论id转换为评论内容
        for (ComicComment comicComment : comicCommentList) {
            if (comicComment.getCommentId() != 0) {
                comicComment.setComment(comicCommentDao.selectCommentByCommentId
                        (comicComment.getCommentId()).getComment());
                Long time = Long.parseLong(comicComment.getCreateTime());
                comicComment.setCreateTime(sdfDatetime.format(new Date(time)));
                // TODO : 得到用户的头像和用户名
                //设置用户姓名头像
//                comicComment.setUserName
//                        (userService.getUserById(comicComment.getUserId()).getUserName());
//                comicComment.setAvatar(
//                        userService.getUserById(comicComment.getUserId()).getAvatar());
            }
        }
        return comicCommentList;
    }
}
