package com.design_patterns.design_pattern.Builder_design_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Robot implements RobotPlan{
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;
}
