package com.comic.springbootproject.comment.entity;


import com.comic.springbootproject.common.entiy.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "comment")
public class Comment extends AbstractEntity {

    private int comicId;
    private int userId;
    private int otherId;
    private String comment;

    public int getComicId() {
        return comicId;
    }

    public void setComicId(int comicId) {
        this.comicId = comicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOtherId() {
        return otherId;
    }

    public void setOtherId(int otherId) {
        this.otherId = otherId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
