package SOLID.I.GoodCodeDesign.MediaPlayers;

import SOLID.I.GoodCodeDesign.MediaPlayers.Interfaces.AudioMediaPlayer;

public class WinampMediaPlayer implements AudioMediaPlayer {

    @Override
    public void playAudio() {
        System.out.println("[WinampMediaPlayer]: Playing audio ..............");
    }
}
