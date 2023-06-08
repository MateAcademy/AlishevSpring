//package com.klunniy.springcourse.utils;
//
//import com.klunniy.springcourse.song.Song;
//import com.klunniy.springcourse.song.impl.*;
//import org.springframework.context.annotation.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Configuration //пометим файл как конфигурационный
//@ComponentScan("com.klunniy.springcourse")  //это путь до наших компонентов
//@PropertySource("classpath:musicPlayer.properties") //указываем путь к файлу с нашими значениями
//public class SpringConfig2 {
//
//    @Bean
//    @Scope("singleton")
//    public List<Song> classicalList() {
//        return Arrays.asList(new Classic1(), new Classic2(), new Classic3());
//    }
//
//    @Bean
//    @Scope("singleton")
//    public List<Song> rocklList() {
//        return Arrays.asList(new Rock1(), new Rock2(), new Rock3());
//    }
//}