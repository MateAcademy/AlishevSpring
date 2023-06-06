package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;

public class Classic3 implements Song {
    private String nameSong = "Classic3-Song";
    @Override
    public void playSong() {
        System.out.println(nameSong);
    }
}
