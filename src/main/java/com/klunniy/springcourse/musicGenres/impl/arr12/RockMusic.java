package com.klunniy.springcourse.musicGenres.impl.arr12;

import com.klunniy.springcourse.song.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Component
public class RockMusic implements MusicB {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    @Qualifier("rocklList")
    private List<Song> songList;


    @Override
    public void playSong() {
        for (Song song : songList) {
            song.playSong();
        }
        System.out.println("name=" + name + "volume=" + volume + "\n");
    }
}
