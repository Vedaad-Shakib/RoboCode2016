package org.usfirst.frc.team5677.robot.commands;

import org.usfirst.frc.team5677.robot.subsystems.Manipulator;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ConveyorMotorToggleCommand extends Command {
	Manipulator manipulator;
	double eps = Math.pow(10, -6);
	
    public ConveyorMotorToggleCommand() {
    	manipulator = Manipulator.getInstance();
        requires(manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (manipulator.conveyorGetSpeed() < eps || manipulator.conveyorGetSpeed() > -eps)
    		manipulator.conveyorSetSpeed(1);
    	else
    		manipulator.conveyorSetSpeed(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
