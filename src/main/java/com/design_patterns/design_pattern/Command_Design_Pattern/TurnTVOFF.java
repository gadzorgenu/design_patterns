package com.design_patterns.design_pattern.Command_Design_Pattern;

public class TurnTVOFF implements Command{
    ElectronicDevice theDevice;

    public TurnTVOFF(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
