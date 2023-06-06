package com.klunniy.springcourse.musicGenres.impl.arr12;

import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.song.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CollectionConfig {

    @Bean
    public List<Song> classicalList() {
        return Arrays.asList(new Classic1(), new Classic2(), new Classic3());
    }

    @Bean
    public List<Song> rocklList() {
        return Arrays.asList(new Rock1(), new Rock2(), new Rock3());
    }
}