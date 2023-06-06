package com.klunniy.springcourse;

import com.klunniy.springcourse.model.Music;
import com.klunniy.springcourse.model.impl.ClassicalMusic;
import com.klunniy.springcourse.model.impl.RockMusic;
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

    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    //IoC
//    public MusicPlayer(List<Music> music) {
//        this.music = music;
//    }
//
    public String playMusic() {
        return classicalMusic.getSong();
    }

}
