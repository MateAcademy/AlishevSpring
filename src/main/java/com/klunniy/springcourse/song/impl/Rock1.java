package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.musicGenres.Music;
import com.klunniy.springcourse.song.Song;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Rock1 implements Song {
    private String nameSong = "Rock1-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}
