package com.klunniy.springcourse.utils;

import com.klunniy.springcourse.song.Song;

import java.util.List;
import java.util.Random;

public class PlayMusic {
    public static void playSong(List<Song> songList) {
        Random random = new Random();
        int randomIndex = random.nextInt(songList.size());
        songList.get(randomIndex).playSong();
    }
}
