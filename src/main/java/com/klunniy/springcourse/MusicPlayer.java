package com.klunniy.springcourse;

import com.klunniy.springcourse.enums.MusicEnum;
import com.klunniy.springcourse.musicGenres.Music;
import com.klunniy.springcourse.musicGenres.impl.ClassicalMusic;
import com.klunniy.springcourse.musicGenres.impl.RockMusic;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public Music playMusic(MusicEnum musicEnum) {
        if (musicEnum == MusicEnum.ROCK) {
            return rockMusic;
        } else return classicalMusic;
    }

}
