package com.musicstreaming;

public class ExternalMusicPlayerAdapter implements MusicSource {
    private ExternalMusicPlayer externalPlayer; 

    public ExternalMusicPlayerAdapter(ExternalMusicPlayer externalPlayer) {
        this.externalPlayer = externalPlayer;
    }

    @Override
    public void play() {
        externalPlayer.playMusic();
    }

    @Override
    public String getDescription() {
        return "External Music Player: " + externalPlayer.getTrackName();
    }

}
