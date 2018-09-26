public class RemoteControlTest { //Client
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl(); //Invoker
        Light light = new Light(); //Receiver
        GarageDoor garageDoor = new GarageDoor();//Receiver2
        LightOnCommand lightOn = new LightOnCommand(light); //Command
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);//Command2

        remote.setCommand(lightOn); //Pass command to Invoker
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
