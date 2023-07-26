package com.design_patterns.design_pattern.Command_Design_Pattern;

import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args){
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVON onCommand = new TurnTVON(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        TurnTVOFF offCommand= new TurnTVOFF(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        TurnTVUP volUpCommand = new TurnTVUP(newDevice);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television theTV = new Television();

        Radio theRadio = new Radio();

        TurnITAllOff turnOffDevices = new TurnITAllOff(List.of(theRadio, theRadio));

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();
    }
}
