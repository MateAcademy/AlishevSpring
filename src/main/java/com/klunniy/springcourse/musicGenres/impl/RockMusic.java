package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
import com.klunniy.springcourse.song.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Component
public class RockMusic implements Music {

    @Autowired
    private List<Song> songList;
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
