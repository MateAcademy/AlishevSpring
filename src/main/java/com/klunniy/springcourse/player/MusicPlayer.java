package com.klunniy.springcourse.player;

import com.klunniy.springcourse.enums.MusicEnum;
import com.klunniy.springcourse.typeOfMusic.MusicB;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    private MusicB music1;

    private MusicB music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") MusicB music1,
                       @Qualifier("rockMusic") MusicB music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicEnum musicEnum) {
        if (musicEnum == MusicEnum.ROCK)
            music2.playSong();
        else music1.playSong();
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
