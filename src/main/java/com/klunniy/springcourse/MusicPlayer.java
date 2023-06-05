package com.klunniy.springcourse;

import com.klunniy.springcourse.model.Music;
import com.klunniy.springcourse.model.impl.ClassicalMusic;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
public class MusicPlayer {
    private List<Music> music;
    private String name;
    private int volume;

    @Autowired
    private ClassicalMusic classicalMusic;

    //IoC
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        for (Music m : music) {
            System.out.println("Playing: " + m.getSong());
        }
    }

}
