package project2;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
    public void playMp4(String fileName) {
        // Do nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }
}
