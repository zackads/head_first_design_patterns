public class HottubOnCommand implements Command {
    Hottub hottub;
    
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        System.out.println("Hottub is on.");
    }

    public void undo() {
        System.out.println("Hottub is off.");
    }
}