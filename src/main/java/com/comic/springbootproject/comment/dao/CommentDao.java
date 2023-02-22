package com.comic.springbootproject.comment.dao;


import com.comic.comicsystem.comment.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommentDao {

    @Insert("insert into comment(comicId,userId,otherId,comment,update_time,create_date)"
            +"values(#{comicId},#{userId},#{otherId},#{comment},#{updateTime},#{createDate})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertComment(Comment comment);

    @Delete("delete from comment where id = #{id}")
    void deleteCommentById(int id);


}
