package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;

public class Pop3 implements Song {
    private String nameSong = "Pop3-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}