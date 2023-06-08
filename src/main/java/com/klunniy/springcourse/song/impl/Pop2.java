package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;

public class Pop2 implements Song {
    private String nameSong = "Pop2-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}