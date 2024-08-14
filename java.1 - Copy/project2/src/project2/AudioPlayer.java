package project2;

public class AudioPlayer implements MediaPlayer {
    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Play MP3 format natively
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        // Use MediaPlayerAdapter for other formats
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media format. " + audioType + " format not supported.");
        }
    }

}
