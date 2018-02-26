package music;

public class Player1 extends Main {
    protected Player1(double price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Player 1 playing: " + song);
        System.out.println("------------------------------");
    }
}


