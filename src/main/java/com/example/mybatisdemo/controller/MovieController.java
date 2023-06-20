package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.model.Movie;
import com.example.mybatisdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping
    public List<MovieResponse> getMovies(){

        return movieService.findAll().stream().map(MovieResponse::new).toList();
    }

    @PostMapping
    public Movie createMovies(@RequestBody Movie movie) {
        return movieService.create(movie);

    }
}
