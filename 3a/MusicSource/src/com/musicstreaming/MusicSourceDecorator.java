package com.musicstreaming;

public abstract class MusicSourceDecorator implements MusicSource {
    protected MusicSource decoratedMusicSource;

    public MusicSourceDecorator(MusicSource decoratedMusicSource) {
        this.decoratedMusicSource = decoratedMusicSource;
    }

    @Override
    public void play() {
        decoratedMusicSource.play();
    }

    @Override
    public String getDescription() {
        return decoratedMusicSource.getDescription();
    }

}
