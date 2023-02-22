package com.comic.springbootproject.comic.entity;


import com.comic.springbootproject.common.entiy.AbstractEntity;
import lombok.Data;

@Data
public class Comic extends AbstractEntity {
    private int id;
    private String comicName;//名称
    private String nickName;//昵称
    private String author;//作者
    private String region;//地区
    private String remark;
    private String year;//上映年
    private String releaseTime;//上映时间
    private String description;//详情
    private String cover;//封面
    private int popularity;//热度

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
}
