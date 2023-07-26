package com.design_patterns.design_pattern.Command_Design_Pattern;

public class TurnTVUP implements Command{
    ElectronicDevice theDevice;

    public TurnTVUP(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
