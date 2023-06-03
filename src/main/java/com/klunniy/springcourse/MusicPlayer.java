package com.klunniy.springcourse;

/**
 * @author Serhii Klunniy
 */
public class MusicPlayer {
    private Music music;

    public MusicPlayer() {
    }

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
