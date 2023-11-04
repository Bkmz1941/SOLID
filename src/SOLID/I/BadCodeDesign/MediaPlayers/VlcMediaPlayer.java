package SOLID.I.BadCodeDesign.MediaPlayers;

public class VlcMediaPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("[VlcMediaPlayer]: Playing audio ..........");
    }

    @Override
    public void playVideo() {
        System.out.println("[VlcMediaPlayer]: Playing video ..........");
    }
}
