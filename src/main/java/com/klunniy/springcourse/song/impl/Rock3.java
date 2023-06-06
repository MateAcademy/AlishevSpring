package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Component
public class Rock3 implements Song {
    private String nameSong = "Rock3-Song";

    public void playSong() {
        System.out.println(nameSong);
    }

}