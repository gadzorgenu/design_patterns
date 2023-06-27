package com.design_patterns.design_pattern.Builder_design_pattern;

public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;

    public OldRobotBuilder(){
        robot = new Robot();
    }
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Tin Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller skates");
    }

    public Robot getRobot(){
        return this.robot;
    }
}
