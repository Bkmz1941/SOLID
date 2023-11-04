package SOLID.I.BadCodeDesign;

import SOLID.I.BadCodeDesign.MediaPlayers.DivMediaPlayer;
import SOLID.I.BadCodeDesign.MediaPlayers.MediaPlayer;
import SOLID.I.BadCodeDesign.MediaPlayers.VlcMediaPlayer;
import SOLID.I.BadCodeDesign.MediaPlayers.WinampMediaPlayer;

public class Main {
    public static void main(String[] args) {
        play(new VlcMediaPlayer());
        play(new WinampMediaPlayer());
        play(new DivMediaPlayer());
    }

    private static void play(MediaPlayer player) {
        try {
            System.out.printf("[%s]: Start%n", player.getClass().getSimpleName());
            player.playVideo();
            player.playAudio();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.printf("[%s]: End%n%n", player.getClass().getSimpleName());
        }
    }
}
