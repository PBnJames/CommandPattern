public class RemoteControlTest { //Client
    public static void main(String[] args){
        RemoteControlWithUndo remote = new RemoteControlWithUndo(); //Invoker

        CeilingFan bedroomCeilingFan = new CeilingFan("Bedroom");
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(bedroomCeilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(bedroomCeilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(bedroomCeilingFan);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] partyOn = {livingRoomLightOn, livingRoomLightOff, stereoOnWithCDCommand};
        Command[] partyOff = {livingRoomLightOff, livingRoomLightOn, stereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remote.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);
        remote.setCommand(3, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(4, ceilingFanHigh, ceilingFanOff);
        remote.setCommand(5, partyOnMacro, partyOffMacro);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(3);
        System.out.println(remote);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(5);
        remote.offButtonWasPushed(5);
        remote.undoButtonWasPushed();
    }
}
