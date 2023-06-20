package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping
    public List<FavoriteResponse> findAll() {
        return favoriteService.findAll().stream().map(FavoriteResponse::new).toList();
    }

    @PostMapping
    public FavoriteRequest createFavorites(@RequestBody FavoriteRequest favoriteRequest) {
        return favoriteService.create(favoriteRequest);
    }
}
