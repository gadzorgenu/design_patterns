package com.design_patterns.design_pattern.Command_Design_Pattern;

public class Radio implements  ElectronicDevice{
    private int volume = 0;
    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio volume is at :"+ volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio volume is at: " + volume);
    }
}
