package org.usfirst.frc3133.Robot.subsystems;


import org.usfirst.frc3133.Robot.Robot;
import org.usfirst.frc3133.Robot.RobotMap;
import org.usfirst.frc3133.Robot.commands.DriveArcade;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//variables used for 2 motor drive
	Talon Drive_Right;
	Talon Drive_Left;
	
	RobotDrive drive;
	
	public DriveTrain() {
		// TODO Auto-generated constructor stub

			Drive_Right = new Talon(RobotMap.Drive_Right);
			Drive_Left = new Talon(RobotMap.Drive_Left);
			drive = new RobotDrive(Drive_Left, Drive_Right);


}
	
	@Override
	protected void initDefaultCommand() {
		
		// TODO Auto-generated method stub
		setDefaultCommand(new DriveArcade());
	}
	public void arcadeDrive(){
		drive.arcadeDrive(Robot.oi.drive.getX(), Robot.oi.drive.getZ());
	}
}