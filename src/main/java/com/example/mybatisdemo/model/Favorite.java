package com.example.mybatisdemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "favorites", uniqueConstraints = {@UniqueConstraint(name = "favorite_movie", columnNames = {"movie_id"})})
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Column(name = "watched_at")
    private Date watched_at;

    @Column(name = "comment")
    private String comment;

    public Favorite(){

    }

    public Favorite(int id, Movie movie, Date watched_at, String comment) {
        this.id = id;
        this.movie = movie;
        this.watched_at = watched_at;
        this.comment = comment;
    }
}
