package com.klunniy.springcourse;

import com.klunniy.springcourse.song.Song;
import com.klunniy.springcourse.song.impl.Classic1;
import com.klunniy.springcourse.song.impl.Classic2;
import com.klunniy.springcourse.song.impl.Classic3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CollectionConfig {

    @Bean
    public List<Song> nameList() {
        return Arrays.asList(new Classic2(), new Classic1(), new Classic3());
    }
}