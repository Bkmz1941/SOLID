package SOLID.I.GoodCodeDesign;

import SOLID.I.GoodCodeDesign.MediaPlayers.*;
import SOLID.I.GoodCodeDesign.MediaPlayers.Interfaces.AudioMediaPlayer;
import SOLID.I.GoodCodeDesign.MediaPlayers.Interfaces.MediaPlayer;
import SOLID.I.GoodCodeDesign.MediaPlayers.Interfaces.VideoMediaPlayer;

public class Main {
    public static void main(String[] args) {
        play(new VlcMediaPlayer());
        play(new WinampMediaPlayer());
        play(new DivMediaPlayer());
    }

    private static void play(MediaPlayer player) {
        try {
            System.out.printf("[%s]: Start%n", player.getClass().getSimpleName());
            if (player instanceof VideoMediaPlayer) {
                ((VideoMediaPlayer) player).playVideo();
            }
            if (player instanceof AudioMediaPlayer) {
                ((AudioMediaPlayer) player).playAudio();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.printf("[%s]: End%n%n", player.getClass().getSimpleName());
        }
    }
}
