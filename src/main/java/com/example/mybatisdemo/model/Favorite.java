package com.example.mybatisdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Favorite {

    private int id;

    private Movie movie;

    private Date watched_at;

    private String comment;

    public Favorite(){

    }


}
