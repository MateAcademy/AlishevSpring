package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.musicGenres.Music;

public class Rock1 implements Music {
    private String nameSong = "Rock1-Song";

    @Override
    public void playSong() {
        System.out.println(nameSong);
    }

    @Override
    public String getSong() {
        return null;
    }
}
