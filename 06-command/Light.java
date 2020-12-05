public class Light {
    boolean on; 

    public Light() {
        on = false;  
    }

    public void on() {
        this.on = true;
        System.out.println("Light is on");
    }

    public void off() {
        this.on = false;
        System.out.println("Light is off");
    }
}