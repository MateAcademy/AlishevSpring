package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Rock1 implements Song {
    private String nameSong = "Rock1-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}
