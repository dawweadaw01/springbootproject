package com.comic.springbootproject.comment.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Data
public class ComicComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int comicId;
    private int userId;
    private int commentId;
    private String createTime;
    @Transient
    private String comment;
    @Transient
    private String userName;
    @Transient
    private String avatar;

    public ComicComment() {
    }

    public ComicComment(int comicId, int userId, int commentId, String createTime) {
        this.comicId = comicId;
        this.userId = userId;
        this.commentId = commentId;
        this.createTime = createTime;
    }
}
