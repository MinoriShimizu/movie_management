package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.model.Movie;
import com.example.mybatisdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/movies")
    public List<MovieResponse> getMovies(){

        return movieService.findAll().stream().map(MovieResponse::new).toList();
    }

    @PostMapping("/movies")
    public Movie createMovies(@RequestBody Movie movie) {
        return movieService.create(movie);

    }
}
