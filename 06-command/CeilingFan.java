public class CeilingFan {
    String speed;
    String room;

    public CeilingFan(String room) {
        this.room = room;
    }

    public void high() {
        this.speed = "high";
        System.out.println(this.room + " ceiling fan is on high");
    }

    public void medium() {
        this.speed = "medium";
        System.out.println(this.room + " ceiling fan is on medium");
    }

    public void low() {
        this.speed = "low";
        System.out.println(this.room + " ceiling fan is on low");
    }

    public void off() {
        this.speed = "off";
        System.out.println(this.room + " ceiling fan is off");
    }

    public void getSpeed() {
        System.out.println(this.speed);
    }
}