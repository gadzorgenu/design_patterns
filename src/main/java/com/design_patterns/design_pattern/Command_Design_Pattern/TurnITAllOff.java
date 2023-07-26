package com.design_patterns.design_pattern.Command_Design_Pattern;

import java.util.List;

public class TurnITAllOff implements Command{
    List<ElectronicDevice> devices;

    public TurnITAllOff(List<ElectronicDevice> newDevices){
        devices = newDevices;
    }

    @Override
    public void execute() {
        for(ElectronicDevice device : devices){
            device.off();
        }
    }

    @Override
    public void undo() {
        for(ElectronicDevice device: devices){
            device.on();
        }
    }
}
