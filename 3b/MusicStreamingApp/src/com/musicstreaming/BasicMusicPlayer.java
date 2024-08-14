package com.musicstreaming;

public class BasicMusicPlayer implements MusicPlayer {
    private MusicSource musicSource;

    public BasicMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music with Basic Player:");
        musicSource.play();
    }
}


