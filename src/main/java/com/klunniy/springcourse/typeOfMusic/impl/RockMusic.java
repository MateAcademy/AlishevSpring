package com.klunniy.springcourse.typeOfMusic.impl;

import com.klunniy.springcourse.typeOfMusic.MusicB;
import com.klunniy.springcourse.song.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class RockMusic implements MusicB {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Qualifier("rocklList")
    private List<Song> songList;

    public RockMusic(@Qualifier("rocklList") List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public void playSong() {
        for (Song song : songList) {
            song.playSong();
        }
        System.out.println("name=" + name + "volume=" + volume + "\n");
    }

    @PostConstruct
    private void doMyInit(){
        System.out.println("Doing my initialization RockMusic");
    }

    @PreDestroy
    private void doMyDestroy() {
        System.out.println("Doing my destruction RockMusic");
    }
}
