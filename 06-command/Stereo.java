public class Stereo {
    int volume;
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Stereo is on.");
    }
    
    public void off() {
        System.out.println("Stereo is off.");
    }

    public void setCd() {
        System.out.println("Stereo is set to CD mode.");
    }

    public void setDvd() {
        System.out.println("Stereo is set to DVD mode.");
    }

    public void setRadio() {
        System.out.println("Stereo is set to radio mode.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo is at " + this.volume);
    }
}