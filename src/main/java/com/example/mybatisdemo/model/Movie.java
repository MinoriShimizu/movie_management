package com.example.mybatisdemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;

    @Column(name = "category")
    private String category;

    @Column(name = "name")
    private String name;
    @Column(name = "director")
    private String director;

    @Column(name = "released_at")
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
