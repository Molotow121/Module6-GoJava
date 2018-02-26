package music;

public class Player3 extends Main {
    protected Player3(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Player 3 playing:" + songs[0]);

    }

    @Override
    public void playAllSongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println("Player 3 playing:" + songs[i] + " ");
        }
        System.out.println("------------------------------");
    }
}