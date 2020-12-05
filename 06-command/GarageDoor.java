public class GarageDoor {
    String room; 
    
    public GarageDoor(String room) {
        this.room = room;
    }

    public void up() {
        System.out.println("Garage Door is up.");
    }

    public void down() {
        System.out.println("Garage Door is down.");
    }

    public void stop() {
        System.out.println("Garage Door is neigther up nor down.");
    }

    public void lightOn() {
        System.out.println("Garage light is on.");
    }

    public void lightOff() {
        System.out.println("Garage light is off.");
    }
}