package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Classic2 implements Song {
    private String nameSong = "Classic2-Song";

    @Override
    public void playSong() {
        System.out.println(nameSong);
    }

}
