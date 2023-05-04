package com.example.mybatisdemo.service;

import com.example.mybatisdemo.mapper.MovieMapper;
import com.example.mybatisdemo.model.Movie;
import com.example.mybatisdemo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }
}
