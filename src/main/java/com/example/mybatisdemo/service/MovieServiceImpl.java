package com.example.mybatisdemo.service;

import com.example.mybatisdemo.MovieNotFoundException;
import com.example.mybatisdemo.mapper.MovieMapper;
import com.example.mybatisdemo.model.Movie;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;

    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    public Movie findByName(String name) {
        Optional<Movie> movie = movieMapper.findByName(name);
        //movie.orElseThrow(() -> new MovieNotFoundException("movie not found"));
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw  new MovieNotFoundException("movie not found");
        }
    }

    public Movie create(Movie movie) {
        movieMapper.create(movie);
        return movie;
    }

    public Movie update(Movie movie){
        movieMapper.update(movie);
        return movie;
    }

    public Movie delete(int id) {
        return movieMapper.delete(id);
    }
}
