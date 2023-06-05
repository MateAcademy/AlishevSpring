package com.klunniy.springcourse;

import com.klunniy.springcourse.model.impl.ClassicalMusic;
import com.klunniy.springcourse.model.impl.OldMusic;
import com.klunniy.springcourse.model.impl.RapMusic;
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

        var classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


//        OldMusic oldMusic = context.getBean("musicBean", OldMusic.class);
//        System.out.println(oldMusic.getSong());
//
//        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
//        System.out.println(rapMusic.getSong());

//        var classicalBean = context.getBean("classicalBean", ClassicalMusic.class);
//        System.out.println(classicalBean.getSong());
//
//        var classicalBean2 = context.getBean("classicalBean", ClassicalMusic.class);

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
