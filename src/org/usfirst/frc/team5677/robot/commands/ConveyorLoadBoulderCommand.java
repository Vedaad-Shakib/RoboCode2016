package org.usfirst.frc.team5677.robot.commands;

import org.usfirst.frc.team5677.robot.subsystems.Manipulator;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Triggers the conveyor solenoid to quickly push the ball into the shooter.
 * 
 * @author Vedaad Shakib
 */
public class ConveyorLoadBoulderCommand extends Command {
	Manipulator manipulator;
	
    public ConveyorLoadBoulderCommand() {
        manipulator = Manipulator.getInstance();
        requires(manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	manipulator.loadBoulder();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
