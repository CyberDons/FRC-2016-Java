
package org.usfirst.frc3133.Robot.commands;

import org.usfirst.frc3133.Robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveArcade extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.driveTrain);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveTrain.arcadeDrive();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}