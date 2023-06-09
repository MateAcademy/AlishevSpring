package com.klunniy.springcourse.musicGenres.impl;

import com.klunniy.springcourse.musicGenres.MusicGenres;
import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.utils.PlayMusic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class RockGenres implements MusicGenres {

    public List<Song> songList;

    public RockGenres(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public void playMusic() {
        PlayMusic.playSong(songList);
    }

    @PostConstruct
    private void initMethod() {
        System.out.println("init method in RockGenres");
    }

    @PreDestroy
    private void destroyMethod() {
        System.out.println("destroy method in RockGenres");
    }

}
