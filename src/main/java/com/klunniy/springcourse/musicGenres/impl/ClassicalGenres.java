package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.MusicGenres;
import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.utils.PlayMusic;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class ClassicalGenres implements MusicGenres {
    private List<Song> songList;

    public ClassicalGenres(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public void playMusic() {
        PlayMusic.playSong(songList);
    }

}
