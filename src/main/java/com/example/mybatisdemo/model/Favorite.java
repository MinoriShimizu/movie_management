package com.example.mybatisdemo.model;

import lombok.AllArgsConstructor;

import lombok.Getter;


import java.util.Date;

@Getter
@AllArgsConstructor
public class Favorite {

    private int id;

    private Movie movie;

    private Date watched_at;

    private String comment;

    public Favorite(){

    }


}
