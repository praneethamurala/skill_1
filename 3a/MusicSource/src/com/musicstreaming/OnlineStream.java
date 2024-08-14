package com.musicstreaming;

public class OnlineStream implements MusicSource {
	    private String streamURL;

	    public OnlineStream(String streamURL) {
	        this.streamURL = streamURL;
	    }

	    @Override
	    public void play() {
	        System.out.println("Streaming from URL: " + streamURL);
	    }

	    @Override
	    public String getDescription() {
	        return "Online Stream: " + streamURL;
	    }
	}


