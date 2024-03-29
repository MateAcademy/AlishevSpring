package com.klunniy.springcourse;

import com.klunniy.springcourse.enums.MusicEnum;
import com.klunniy.springcourse.musicGenres.Music;
import com.klunniy.springcourse.musicGenres.impl.arr12.ClassicalMusic;
import com.klunniy.springcourse.musicGenres.impl.arr12.RockMusic;
import com.klunniy.springcourse.song.Song;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
@Component
@Scope("prototype")
public class MusicPlayer {

    @Value("${musicPlayer.name2}")
    private String name;

    @Value("${musicPlayer.volume2}")
    private int volume;


    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicEnum musicEnum) {
        if (musicEnum == MusicEnum.ROCK)
            rockMusic.playSong();
        else classicalMusic.playSong();
    }

    public void musicPlayerConstants() {
        System.out.println("name=" + name);
        System.out.println("volume=" + volume);
    }

    @PostConstruct
    private void doMyInit(){
        System.out.println("Doing my initialization MusicPlayer");
    }

    @PreDestroy
    private void doMyDestroy() {
        System.out.println("Doing my destruction MusicPlayer");
    }

}
