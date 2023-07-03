package com.klunniy.springcourse.utils;

import com.klunniy.springcourse.musicGenres.MusicGenres;
import com.klunniy.springcourse.musicGenres.impl.PopGenres;
import com.klunniy.springcourse.player.MusicPlayer;
import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.song.impl.*;
import com.klunniy.springcourse.musicGenres.impl.ClassicalGenres;
import com.klunniy.springcourse.musicGenres.impl.RockGenres;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Этот класс содержит в себе конфигурацию spring приложения
 */
@Configuration //пометим файл как конфигурационный
@ComponentScan("com.klunniy.springcourse")  //это путь до наших компонентов
@PropertySource("classpath:musicPlayer.properties") //указываем путь к файлу с нашими значениями
public class SpringConfig {

    //MusicPlayer - ожидает на вход список из музыкальных жанров:
    @Bean
    @Scope("singleton")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenresList());
    }

    //список музыкальных жанров:
    @Bean
    @Scope("singleton")
    public List<MusicGenres> musicGenresList() {
        return Arrays.asList(classicalGenres(), popGenres(), rockGenres());
    }

    //три музыкальных жанра, в каждом по три песни:
    @Bean
    @Scope("prototype")
    public ClassicalGenres classicalGenres() {
        return new ClassicalGenres(classicalList());
    }

    @Bean
    @Scope("prototype")
    public PopGenres popGenres() {
        return new PopGenres(popList());
    }

    @Bean
    @Scope("prototype")
    public RockGenres rockGenres() {
        return new RockGenres(rockList());
    }

    //списки песен 3шт, классический поп и рок:
    @Bean
    @Scope("singleton")
    public List<Song> classicalList() {
        return Arrays.asList(classic1(), classic2(), classic3());
    }

    @Bean
    @Scope("singleton")
    public List<Song> popList() {
        return Arrays.asList(pop1(), pop2(), pop3());
    }
    @Bean
    @Scope("singleton")
    public List<Song> rockList() {
        return Arrays.asList(rock1(), rock2(), rock3());
    }

    //три бина классических песен
    @Bean
    @Scope("singleton")
    public Classic1 classic1() {
        return new Classic1();
    }

    @Bean
    @Scope("singleton")
    public Classic2 classic2() {
        return new Classic2();
    }

    @Bean
    @Scope("singleton")
    public Classic3 classic3() {
        return new Classic3();
    }


    //три бина поп песен:
    @Bean
    @Scope("singleton")
    public Pop1 pop1() {
        return new Pop1();
    }

    @Bean
    @Scope("singleton")
    public Pop2 pop2() {
        return new Pop2();
    }

    @Bean
    @Scope("singleton")
    public Pop3 pop3() {
        return new Pop3();
    }

    //три рок песни, бины:
    @Bean
    @Scope("singleton")
    public Rock1 rock1() {
        return new Rock1();
    }

    @Bean
    @Scope("singleton")
    public Rock2 rock2() {
        return new Rock2();
    }

    @Bean
    @Scope("singleton")
    public Rock3 rock3() {
        return new Rock3();
    }
}