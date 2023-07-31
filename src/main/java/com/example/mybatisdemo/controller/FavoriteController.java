package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.FavoriteNotFoundException;
import com.example.mybatisdemo.MovieNotFoundException;
import com.example.mybatisdemo.model.Favorite;
import com.example.mybatisdemo.service.FavoriteService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping
    public List<FavoriteResponse> findAll() {
        return favoriteService.findAll().stream().map(FavoriteResponse::new).toList();
    }

    @GetMapping("/{id}")
    public Favorite getFavorite(@PathVariable("id") int id) {
        return favoriteService.findById(id);
    }

    @PostMapping
    public FavoriteRequest createFavorites(@RequestBody FavoriteRequest favoriteRequest) {
        return favoriteService.create(favoriteRequest);
    }

    @PutMapping("/{id}")
    public FavoriteRequest updateFavorites(@PathVariable("id") int id, @RequestBody FavoriteRequest favoriteRequest) {
        return favoriteService.update(favoriteRequest);
    }

    @DeleteMapping("/{id}")
    public Favorite deleteFavorite(@PathVariable("id") int id) {
        return favoriteService.delete(id);
    }

    @ExceptionHandler(value = FavoriteNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoResourceFound(
            FavoriteNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
