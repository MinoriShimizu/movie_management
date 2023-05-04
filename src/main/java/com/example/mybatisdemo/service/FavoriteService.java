package com.example.mybatisdemo.service;

import com.example.mybatisdemo.model.Favorite;
import java.util.List;

public interface FavoriteService {
    List<Favorite> findAll();
}
