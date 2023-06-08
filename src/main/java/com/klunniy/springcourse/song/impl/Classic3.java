package com.klunniy.springcourse.song.impl;

import com.klunniy.springcourse.song.Song;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Classic3 implements Song {
    private String nameSong = "Classic3-Song";

    @Override
    public void playSong() {
        System.out.println(nameSong);
    }

}
