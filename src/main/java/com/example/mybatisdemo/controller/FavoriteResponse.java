package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.model.Favorite;

import lombok.Getter;

import java.util.Date;

@Getter
public class FavoriteResponse {
    private String movie_category;

    private String movie_name;

    private String comment;

    private Date watched_at;

    public FavoriteResponse(Favorite favorite) {
        this.movie_category = favorite.getMovie().getCategory();
        this.movie_name = favorite.getMovie().getName();
        this.comment = favorite.getComment();
        this.watched_at = favorite.getWatched_at();
    }
}
