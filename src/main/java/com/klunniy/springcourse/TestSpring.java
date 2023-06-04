package com.klunniy.springcourse;

import com.klunniy.springcourse.model.impl.ClassicalMusic;
import com.klunniy.springcourse.model.impl.UkraineFootball;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
//        String str = "hello";
//        StringBuilder sb = new StringBuilder();

        var context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalBean = context.getBean("classicalBean", ClassicalMusic.class);

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());


//        var ukraineFootball = context.getBean("ukraineFootball", UkraineFootball.class);
//        System.out.println(ukraineFootball.play());
//
//        ukraineFootball.setName("ZSU");
//
//        var ukraineFootball2 = context.getBean("ukraineFootball", UkraineFootball.class);
//        System.out.println(ukraineFootball2.play());

        context.close();
    }
}
