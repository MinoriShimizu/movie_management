package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.model.Favorite;
import com.example.mybatisdemo.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/favorites")
    public List<FavoriteResponse> findAll() {
        return favoriteService.findAll().stream().map(FavoriteResponse::new).toList();
    }
}
