public class RemoteControlTest { //Client
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl(); //Invoker
        Light light = new Light(); //Receiver
        LightOnCommand lightOn = new LightOnCommand(light); //Command

        remote.setCommand(lightOn); //Pass command to Invoker
        remote.buttonWasPressed();
    }
}
