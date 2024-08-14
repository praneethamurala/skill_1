package com.musicstreaming;

public class AdvancedMusicPlayer implements MusicPlayer {
    private MusicSource musicSource;

    public AdvancedMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music with Advanced Player:");
        musicSource.play();
    }

}
