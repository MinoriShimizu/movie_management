package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FavoriteMapper {

    /*@Select("SELECT movies.category, movies.name, favorites.watched_at, favorites.comment FROM favorites INNER JOIN movies ON favorites.movies_id = movies.movie_id")
    @Select("SELECT * FROM favorites INNER JOIN movies ON favorites.movies_id = movies.movie_id")
    @Results(id = "FavoritesMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "movie_id", property = "movie",
            one = @One(select = "com.example.mybatisdemo.mapper.MovieMapper.findById")),
            @Result(column = "watched_at", property = "watched_at"),
            @Result(column = "comment", property = "comment")
    })*/
    List<Favorite> findAll();
}
