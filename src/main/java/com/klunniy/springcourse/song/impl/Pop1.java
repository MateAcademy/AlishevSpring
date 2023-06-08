package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;

public class Pop1 implements Song {
    private String nameSong = "Pop1-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}
