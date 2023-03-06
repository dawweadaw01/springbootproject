package com.comic.springbootproject.comic.service;


import com.comic.springbootproject.comic.entity.Comic;
import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.common.vo.Search;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ComicService {
    //插入动漫
    Result<Comic> insertComic(Comic comic);
    //更新动漫
    Result<Comic> updateComic(Comic comic);
    //删除动漫
    Result<Object> deleteComicById(int id);
    //得到动漫
    Comic getComicById(int id);
    //分页查动漫
    PageInfo<Comic> getComicListBySearch(Search search);
    //分页查动漫根据热度
    PageInfo<Comic> getComicListByPopularity();
}
