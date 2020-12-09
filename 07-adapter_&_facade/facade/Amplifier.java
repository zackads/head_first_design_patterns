public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD player to " + dvd.getClass().getName());
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer");
    }

    public void setVolume(Integer volume) {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }
}