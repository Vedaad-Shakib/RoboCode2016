package org.usfirst.frc.team5677.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class IntakeConveyorSetSpeedCommandGroup extends CommandGroup {    
    public  IntakeConveyorSetSpeedCommandGroup(double speed) {
    	addSequential(new ConveyorSetSpeedCommand(speed));
    	addSequential(new IntakeSetSpeedCommand(speed));
    }
}
