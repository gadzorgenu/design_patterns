package com.design_patterns.design_pattern.Builder_design_pattern;

public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();

    public Robot getRobot();

}
