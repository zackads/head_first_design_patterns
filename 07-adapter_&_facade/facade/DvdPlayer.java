public class DvdPlayer {
    String movie; 

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Top-O-Line DVD Player playing \"" + this.movie + "\"");
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped " + this.movie);
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }
}