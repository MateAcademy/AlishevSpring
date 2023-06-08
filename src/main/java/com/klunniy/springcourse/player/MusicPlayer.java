package com.klunniy.springcourse.player;

import com.klunniy.springcourse.musicGenres.MusicGenres;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
public class MusicPlayer {

    private List<MusicGenres> music;

    public MusicPlayer(List<MusicGenres> music) {
        this.music = music;
    }

    public void playMusicGenres() {
        MusicGenres randomElement = getRandomElement(music);
        getRandomSong(randomElement);
    }

    private <T> T getRandomElement(List<T> list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

    private void getRandomSong(MusicGenres musicGenres) {
        musicGenres.playMusic();
    }

//    @PostConstruct
//    private void doMyInit(){
//        System.out.println("Doing my initialization MusicPlayer");
//    }
//
//    @PreDestroy
//    private void doMyDestroy() {
//        System.out.println("Doing my destruction MusicPlayer");
//    }

}
