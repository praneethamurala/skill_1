package com.musicstreaming;

public class EqualizerDecorator extends MusicPlayerDecorator {
    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings...");
    }
}



