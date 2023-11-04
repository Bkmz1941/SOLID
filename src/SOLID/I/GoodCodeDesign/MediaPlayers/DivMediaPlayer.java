package SOLID.I.GoodCodeDesign.MediaPlayers;

import SOLID.I.GoodCodeDesign.MediaPlayers.Interfaces.AudioMediaPlayer;
import SOLID.I.GoodCodeDesign.MediaPlayers.Interfaces.VideoMediaPlayer;

public class DivMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("[DivMediaPlayer]: Playing audio ..........");
    }

    @Override
    public void playVideo() {
        System.out.println("[DivMediaPlayer]: Playing audio ..........");
    }
}
