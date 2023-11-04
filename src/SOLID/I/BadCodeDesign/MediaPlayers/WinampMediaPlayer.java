package SOLID.I.BadCodeDesign.MediaPlayers;

import SOLID.I.BadCodeDesign.Exceptions.VideoUnsupportedException;

public class WinampMediaPlayer implements MediaPlayer {

    @Override
    public void playAudio() {
        System.out.println("[WinampMediaPlayer]: Playing audio ..............");
    }

    // Play video isn't supported
    @Override
    public void playVideo() throws VideoUnsupportedException {
        throw new VideoUnsupportedException("[WinampMediaPlayer]: Video unsupported");
    }
}
