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
@Component
@Scope("singleton")
public class ClassicalMusic implements MusicB {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    @Qualifier("classicalList")
    private List<Song> songList;

    @Override
    public void playSong() {
        for (Song song : songList) {
            song.playSong();
        }
        System.out.println("name=" + name + "volume=" + volume + "\n");
    }

    @PostConstruct
    private void doMyInit(){
        System.out.println("Doing my initialization ClassicalMusic");
    }

    @PreDestroy
    private void doMyDestroy() {
        System.out.println("Doing my destruction ClassicalMusic");
    }

}
