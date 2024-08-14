package com.musicstreaming;

public class EqualizerDecorator extends MusicSourceDecorator {
    public EqualizerDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        super.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings...");
    }

    @Override
    public String getDescription() {
        return decoratedMusicSource.getDescription() + ", with Equalizer";
    }

}
