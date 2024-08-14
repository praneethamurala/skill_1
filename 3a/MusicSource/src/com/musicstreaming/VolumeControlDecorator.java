package com.musicstreaming;

public class VolumeControlDecorator extends MusicSourceDecorator {
    public VolumeControlDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume level...");
    }

    @Override
    public String getDescription() {
        return decoratedMusicSource.getDescription() + ", with Volume Control";
    }

}
