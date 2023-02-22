package com.comic.springbootproject.comic.dao;


import com.comic.springbootproject.comic.entity.Comic;
import com.comic.springbootproject.common.vo.Search;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ComicDao {

    //增  ——传入对象
    @Insert("INSERT INTO comic_table(comicName,nickName,author,region,year,releaseTime,description,cover,popularity)" +
            "VALUES (#{comicName},#{nickName},#{author},#{region},#{year},#{releaseTime},#{description},#{cover},#{popularity})")
    void insertComic(Comic comic);

    //根据名字查  ——传入属性——名
    @Select("SELECT * FROM comic_table WHERE comicName = #{comicName} LIMIT 1")
    Comic getComicByName(String name);

    //根据 id查  ——传入属性——id
    @Select("SELECT * FROM comic_table WHERE id = #{id} LIMIT 1")
    Comic getComicById(int id);

    //更新  ——传入对象
    @Update("UPDATE comic_table SET comicName = #{comicName}, nikeName = #{nickName}, author = #{author}," +
            "region = #{region}, year = #{year}, releaseTime = #{releaseTime}, description=#{description}," +
            "cover = #{cover}, popularity = #{popularity}")
    void updateComic(Comic comic);

    //删除
    @Delete("DELETE FROM comic_table WHERE id= #{id}")
    void deleteComicById(int id);

    //按照地域查照
    @Select("SELECT * FROM comic_table WHERE region = concat('%',#{region},'%')")
    List<Comic> getComicByRegion(String region);

    //模糊查询
    @Select("SELECT * FROM comic_table WHERE comicName like concat('%',#{keyword},'%') or nickName like concat('%',#{keyword},'%') or author like concat('%',#{keyword},'%')")
    //@Select("SELECT * FROM account_user WHERE comicName like keyword or nickName like keyword or author like keyword")
    List<Comic> getComicLikeSearch(String keyword);

    @Select("<script>"
            + "select * from comic_table "
            + "<where> "
            + "<if test='keyword != \"\" and keyword != null'>"
            + " and (comicName like '%${keyword}%' or nickName like '%${keyword}%') "
            + "</if>"
            + "</where>"
            + "<choose>"
            + "<when test='sort != \"\" and sort != null'>"
            + " order by ${sort} ${direction}"
            + "</when>"
            + "<otherwise>"
            + " order by id desc"
            + "</otherwise>"
            + "</choose>"
            + "</script>")
    List<Comic> getComicBySearch(Search search);
}
