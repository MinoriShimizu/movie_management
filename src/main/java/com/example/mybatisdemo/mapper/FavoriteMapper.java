package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.controller.FavoriteRequest;
import com.example.mybatisdemo.model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FavoriteMapper {
    List<Favorite> findAll();

    void create(FavoriteRequest favoriteRequest);
}
