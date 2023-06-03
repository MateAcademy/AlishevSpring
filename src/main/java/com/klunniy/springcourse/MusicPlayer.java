package com.klunniy.springcourse;

/**
 * @author Serhii Klunniy
 */
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public Music getMusic() {
        return music;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
