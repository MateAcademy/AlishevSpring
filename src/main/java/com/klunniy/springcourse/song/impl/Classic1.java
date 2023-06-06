package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;

public class Classic1 implements Song {
    private String nameSong = "Classic1-Song";

    @Override
    public void playSong() {
        System.out.println(nameSong);
    }
}
