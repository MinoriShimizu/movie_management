package com.example.mybatisdemo.service;

import com.example.mybatisdemo.controller.FavoriteRequest;
import com.example.mybatisdemo.model.Favorite;
import java.util.List;

public interface FavoriteService {
    List<Favorite> findAll();

    Favorite findById(int id);
    FavoriteRequest create(FavoriteRequest favoriteRequest);

    FavoriteRequest update(FavoriteRequest favoriteRequest);

    Favorite delete (int id);
}
