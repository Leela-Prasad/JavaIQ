package com.test.test01.model;

import lombok.Data;

import java.util.List;

@Data
public class Genre {
    private int id;
    private String slug;
    private List<Game> games;
}
