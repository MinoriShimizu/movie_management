package com.example.mybatisdemo.service;

import com.example.mybatisdemo.mapper.FavoriteMapper;
import com.example.mybatisdemo.model.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    FavoriteMapper favoriteMapper;

    public List<Favorite> findAll() {
        return favoriteMapper.findAll();

    }
}
