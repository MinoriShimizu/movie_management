package com.example.mybatisdemo.service;

import com.example.mybatisdemo.model.Movie;


import java.util.List;


public interface MovieService {

    List<Movie> findAll();

    Movie findByName(String name);

    Movie create(Movie movie);

    //void update(int id, String name) throws Exception;
}
