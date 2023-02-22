package com.comic.springbootproject.comic.controller;


import com.comic.springbootproject.comic.entity.Comic;
import com.comic.springbootproject.comic.service.ComicService;
import com.comic.springbootproject.common.vo.Result;
import com.comic.springbootproject.common.vo.Search;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comic")
public class ComicController {

    @Autowired
    private ComicService comicService;

    /**
     *    localhost:8080/api/comic/insert   ----post
     *    {"name":"测试数据1","nikeName":"test_data1","author":"测试","region":"中国","year":"2020","releaseTime":"12:12",
     *    "description":"只是测试数据罢了","cover":"","popularity":"2200000"}
     * */
    @PostMapping(value = "insert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Comic> insertComic(@RequestBody Comic comic) {
        return comicService.insertComic(comic);
    }

    /**
     *  localhost:8080/api/comic/update   ----put
     * */
    @PutMapping(value = "update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Comic> updateComic(@RequestBody Comic comic){
        return comicService.updateComic(comic);
    }

    /**
     *  localhost:8080/api/comic/delete/{2}   ----delete
     * */
    @DeleteMapping(value = "/delete/{id}")
    public Result<Object> deleteComic(int id){
        return comicService.deleteComicById(id);
    }

    /**
     *  localhost:8080/api/comic/all   ----post
     *  {"currentPage":1, "pageSize":5, "sort":"id", "direction":"desc", "keyword":""}    ---全查
     *  keyword  即为模糊查询关键字
     *  {"currentPage":1, "pageSize":5, "sort":"id", "direction":"desc", "keyword":"火"}    ---模糊——火
     *  {"currentPage":1, "pageSize":5, "sort":"popularity", "direction":"desc", "keyword":""}   ---按照热度降序，无模糊
     * */
    @PostMapping(value = "/all",consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Comic> getComicBySearch(@RequestBody Search search){
        return comicService.getComicListBySearch(search);
    }

}
