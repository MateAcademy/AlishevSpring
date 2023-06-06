package com.klunniy.springcourse;

import com.klunniy.springcourse.model.Music;
import com.klunniy.springcourse.model.impl.ClassicalMusic;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
@Component
public class MusicPlayer {
//    private List<Music> music;
//    private String name;
//    private int volume;

    private Music music;


    public MusicPlayer(@Qualifier("classicalMusic") Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(@Qualifier("classicalMusic")Music music) {
        this.music = music;
    }

    //IoC
//    public MusicPlayer(List<Music> music) {
//        this.music = music;
//    }
//
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
