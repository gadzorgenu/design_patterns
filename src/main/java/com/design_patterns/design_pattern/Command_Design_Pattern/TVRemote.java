package com.design_patterns.design_pattern.Command_Design_Pattern;

public class TVRemote {
    public static ElectronicDevice getDevice(){
        return new Television();
    }
}
