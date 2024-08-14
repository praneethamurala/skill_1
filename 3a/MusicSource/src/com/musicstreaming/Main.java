package com.musicstreaming;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Select Music Source
	        System.out.print("Choose music source (local, online, radio): ");
	        String sourceType = scanner.nextLine();
	        MusicSource musicSource;

	        switch (sourceType.toLowerCase()) {
	            case "local":
	                System.out.print("Enter local file name: ");
	                String fileName = scanner.nextLine();
	                musicSource = new LocalFile(fileName);
	                break;
	            case "online":
	                System.out.print("Enter stream URL: ");
	                String streamURL = scanner.nextLine();
	                musicSource = new OnlineStream(streamURL);
	              break;
	            case "radio":
	                System.out.print("Enter radio station name: ");
	                String stationName = scanner.nextLine();
	                musicSource = new RadioStation(stationName);
	                break;
	            default:
	                throw new IllegalArgumentException("Unknown music source: " + sourceType);
	        }

	        // Apply Decorators
	        System.out.print("Do you want to add an equalizer? (yes/no): ");
	        String equalizer = scanner.nextLine();
	        if (equalizer.equalsIgnoreCase("yes")) {
	            musicSource = new EqualizerDecorator(musicSource);
	        }

	        System.out.print("Do you want to add volume control? (yes/no): ");
	        String volumeControl = scanner.nextLine();
	        if (volumeControl.equalsIgnoreCase("yes")) {
	            musicSource = new VolumeControlDecorator(musicSource);
	        }

	        // Play Music
	        System.out.println("Playing music with settings: " + musicSource.getDescription());
	        musicSource.play();

	        scanner.close();
	    }
	

}
