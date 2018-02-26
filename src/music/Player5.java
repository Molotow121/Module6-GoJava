package music;

public class Player5 extends Main {
    protected Player5(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Player 5 playing:" + song);
    }

    @Override
    public void playAllSongs() {
        for (int i = songs.length - 1; i >= 0; --i) {
            System.out.println("Player 5 playing:" + songs[i] + " ");
        }
        System.out.println("------------------------------");
    }
}