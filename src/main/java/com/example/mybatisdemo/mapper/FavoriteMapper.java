package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.model.Favorite;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FavoriteMapper {
    @Select("SELECT * FROM favorites INNER JOIN movies ON favorites.movies_id = movies.movie_id")
    List<Favorite> findAll();
}
