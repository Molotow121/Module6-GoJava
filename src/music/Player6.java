package music;

import java.util.Arrays;
import java.util.Collections;

public class Player6 extends Main {
    protected Player6(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Player 6 playing: " + song);
    }

    @Override
    public void playAllSongs() {
    }

    public void shuffle() {
        for (int i = 0; i < songs.length; i++) {
            Collections.shuffle(Arrays.asList(songs));
            System.out.println("Player 6 playing: " + songs[i]);
        }
    }
}