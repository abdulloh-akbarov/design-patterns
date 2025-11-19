package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnLightOnCommand(light);
        Command turnOff = new TurnLightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();
    }
}
