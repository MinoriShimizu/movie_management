package com.example.mybatisdemo.service;

import com.example.mybatisdemo.mapper.MovieMapper;
import com.example.mybatisdemo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;

    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    public Movie create(Movie movie) {
        movieMapper.create(movie);
        return movie;
    }
}
