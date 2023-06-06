package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.Music;
import com.klunniy.springcourse.song.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Component
public class ClassicalMusic implements Music {

    @Autowired
    @Qualifier("nameList")
    private List<Song> songList;

    @Override
    public String getSong() {
        return null;
    }
}
