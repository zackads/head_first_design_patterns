// Client
public class RemoteLoaderWithLambda {
    public static void main(String[] args) {
        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Receivers
        Light livingRoomLight = new Light("Living Room");
        
        remoteControl.setCommand(0, () -> { livingRoomLight.on(); }, () -> { livingRoomLight.off(); });

        remoteControl.onButtonWasPushed(0);
    }
}