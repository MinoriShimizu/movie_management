package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.MovieNotFoundException;
import com.example.mybatisdemo.model.Movie;
import com.example.mybatisdemo.service.MovieService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping
    public List<MovieResponse> getMovies(){
        return movieService.findAll().stream().map(MovieResponse::new).toList();
    }

    @GetMapping("/{name}")
    public Movie getMovie(@PathVariable("name") String name) {
        return movieService.findByName(name);
    }

    @PostMapping
    public Movie createMovies(@RequestBody Movie movie) {
        return movieService.create(movie);

    }

    @ExceptionHandler(value = MovieNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoResourceFound(
            MovieNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }

}
