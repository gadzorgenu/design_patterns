package com.design_patterns.design_pattern.Command_Design_Pattern;

public class DeviceButton {
    Command theCommand;

    public DeviceButton(Command newCommand){
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }

    public void pressUndo(){
        theCommand.undo();
    }
}
