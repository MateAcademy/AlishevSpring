package com.klunniy.springcourse;

import com.klunniy.springcourse.model.Music;
import lombok.Data;
import lombok.NoArgsConstructor;

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
