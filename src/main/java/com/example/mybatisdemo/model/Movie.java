package com.example.mybatisdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class Movie {

    private int id;

    private String category;

    private String name;
    private String director;

    private Date released_at;

    public Movie(){

    }

    public Movie(int id, String category, String name, String director, Date released_at) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.director = director;
        this.released_at = released_at;
    }
}
