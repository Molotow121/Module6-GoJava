package music;

public class Player4 extends Main {
    protected Player4(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Player 4 playing:" + songs[songs.length - 1]);

    }

    @Override
    public void playAllSongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println("Player 4 playing:" + songs[i] + " ");
        }
        System.out.println("------------------------------");
    }
}