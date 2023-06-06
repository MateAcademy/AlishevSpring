package com.klunniy.springcourse;

import com.klunniy.springcourse.enums.MusicEnum;
import com.klunniy.springcourse.musicGenres.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.playMusic(MusicEnum.CLASSICAL);
        }
    }

}
