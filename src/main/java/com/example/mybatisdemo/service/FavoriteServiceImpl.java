package com.example.mybatisdemo.service;

import com.example.mybatisdemo.FavoriteNotFoundException;
import com.example.mybatisdemo.controller.FavoriteRequest;
import com.example.mybatisdemo.mapper.FavoriteMapper;
import com.example.mybatisdemo.model.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    FavoriteMapper favoriteMapper;

    public List<Favorite> findAll() {
        return favoriteMapper.findAll();
    }

    public Favorite findById(int id) {
        Optional<Favorite> favorite = favoriteMapper.findById(id);
        if (favorite.isPresent()) {
            return favorite.get();
        } else {
            throw new FavoriteNotFoundException("favorite not found");
        }
    }

    public FavoriteRequest create(FavoriteRequest favoriteRequest) {
        favoriteMapper.create(favoriteRequest);
        return favoriteRequest;
    }

    public FavoriteRequest update(FavoriteRequest favoriteRequest) {
        favoriteMapper.update(favoriteRequest);
        return favoriteRequest;
    }

    public Favorite delete(int id) {
        return favoriteMapper.delete(id);
    }
}
