package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.musicGenres.Music;
import com.klunniy.springcourse.song.Song;
import org.springframework.stereotype.Component;

@Component
public class Rock1 implements Song {
    private String nameSong = "Rock1-Song";

    public void playSong() {
        System.out.println(nameSong);
    }


}
