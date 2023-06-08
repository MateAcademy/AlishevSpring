package com.klunniy.springcourse.utils;

import com.klunniy.springcourse.player.MusicPlayer;
import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.song.impl.*;
import com.klunniy.springcourse.typeOfMusic.impl.ClassicalMusic;
import com.klunniy.springcourse.typeOfMusic.impl.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Этот класс содержит в себе конфигурацию spring приложения
 */
@Configuration //пометим файл как конфигурационный
//@ComponentScan("com.klunniy.springcourse")  //это путь до наших компонентов
@PropertySource("classpath:musicPlayer.properties") //указываем путь к файлу с нашими значениями
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public List<Song> classicalList() {
        return Arrays.asList(new Classic1(), new Classic2(), new Classic3());
    }

    @Bean
    @Scope("singleton")
    public List<Song> rocklList() {
        return Arrays.asList(new Rock1(), new Rock2(), new Rock3());
    }

    @Bean
    @Scope("singleton")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic(rocklList());
    }

    @Bean
    @Scope("singleton")
    public RockMusic rockMusic() {
        return new RockMusic(rocklList());
    }

    @Bean
    @Scope("singleton")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic());
    }
}