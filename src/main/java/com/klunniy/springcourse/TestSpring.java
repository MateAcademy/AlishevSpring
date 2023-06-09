package com.klunniy.springcourse;

import com.klunniy.springcourse.player.MusicPlayer;
import com.klunniy.springcourse.utils.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusicGenres();
        }
    }

}
