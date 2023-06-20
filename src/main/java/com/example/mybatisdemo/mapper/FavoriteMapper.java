package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.controller.FavoriteRequest;
import com.example.mybatisdemo.model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface FavoriteMapper {
    List<Favorite> findAll();

    Optional<Favorite> findById(int id);

    void create(FavoriteRequest favoriteRequest);
}
