package com.klunniy.springcourse;

import com.klunniy.springcourse.enums.MusicEnum;
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
            musicPlayer.playMusic(MusicEnum.CLASSICAL);
            musicPlayer.playMusic(MusicEnum.ROCK);

//            MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//            System.out.println(musicPlayer == musicPlayer2);
            //musicPlayer.playMusic(MusicEnum.ROCK);
            //musicPlayer.musicPlayerConstants();
        }
    }

}
