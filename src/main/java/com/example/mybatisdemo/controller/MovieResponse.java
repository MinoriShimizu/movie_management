package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.model.Movie;
import lombok.Getter;

@Getter
public class MovieResponse {
    //private int id;
    private String director;

    public MovieResponse(Movie movie){
        this.director = movie.getDirector();

    }
}
