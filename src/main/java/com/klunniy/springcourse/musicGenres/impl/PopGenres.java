package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.MusicGenres;
import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.utils.PlayMusic;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class PopGenres implements MusicGenres {
    public List<Song> songList;

    public PopGenres(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public void playMusic() {
        PlayMusic.playSong(songList);
    }

}
