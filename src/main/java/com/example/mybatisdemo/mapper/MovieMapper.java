package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.model.Movie;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE movie_id = #{id}")
    Optional<Movie> findById(int id);

    @Insert("INSERT INTO movies (name, director) VALUES (#{name}, #{director})")
    void create(Movie movie);

}
