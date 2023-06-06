package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component
public class Rock2 implements Song {
    private String nameSong = "Rock2-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}