package music;

class Main {
    final double price;
    String song = "The Best Song";
    String[] songs = {" First", " Middle", " Last"};

    protected Main(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        new Player1(10).playSong();
        new Player2(15).playSong();
        new Player3(20).playSong();
        new Player3(20).playAllSongs();
        new Player4(25).playSong();
        new Player4(25).playAllSongs();
        new Player5(30).playSong();
        new Player5(30).playAllSongs();
        new Player6(35).playSong();
        new Player6(35).playAllSongs();
        new Player6(35).shuffle();


    }

    double getPrice() {
        return price;
    }

    public void playSong() {

    }

    public void playAllSongs() {
        System.out.println(songs);
    }


}