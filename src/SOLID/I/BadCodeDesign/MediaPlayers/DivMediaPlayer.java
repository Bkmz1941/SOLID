package SOLID.I.BadCodeDesign.MediaPlayers;

public class DivMediaPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("[DivMediaPlayer]: Playing audio ..........");
    }

    @Override
    public void playVideo() {
        System.out.println("[DivMediaPlayer]: Playing audio ..........");
    }
}
