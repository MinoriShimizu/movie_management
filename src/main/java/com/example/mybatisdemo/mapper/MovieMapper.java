package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.model.Movie;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {
    
    List<Movie> findAll();

    Optional<Movie> findByName(String name);

    void create(Movie movie);

    void update(Movie movie);

    Movie delete(int id);

}
