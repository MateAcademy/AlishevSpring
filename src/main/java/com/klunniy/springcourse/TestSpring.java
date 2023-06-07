package com.klunniy.springcourse;

import com.klunniy.springcourse.enums.MusicEnum;
import com.klunniy.springcourse.musicGenres.Music;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

//            System.out.println(musicPlayer == musicPlayer2);
//            musicPlayer.playMusic(MusicEnum.CLASSICAL);
            //musicPlayer.playMusic(MusicEnum.ROCK);

            //musicPlayer.musicPlayerConstants();
        }
    }

}
