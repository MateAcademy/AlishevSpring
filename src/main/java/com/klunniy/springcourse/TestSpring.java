package com.klunniy.springcourse;

import com.klunniy.springcourse.player.MusicPlayer;
import com.klunniy.springcourse.utils.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {


    public static void main(String[] args) {
        //ClassPathXmlApplicationContext
        try (var context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusicGenres();
        }
    }

}
