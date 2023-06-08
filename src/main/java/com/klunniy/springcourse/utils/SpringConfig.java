package com.klunniy.springcourse.utils;

import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.song.impl.*;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Этот класс содержит в себе конфигурацию spring приложения
 */
@Configuration
@ComponentScan("com.klunniy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
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
}