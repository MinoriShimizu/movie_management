package com.example.mybatisdemo.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class FavoriteRequest {
    private String movie_name;
    private Date watched_at;
    private String comment;


    public FavoriteRequest() {

    }
}
