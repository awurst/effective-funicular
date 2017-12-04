package org.usfirst.frc.team2335.robot.subsystems;

import org.usfirst.frc.team2335.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem 
{
	Victor leftMotor;
	Victor rightMotor;
	
	RobotDrive drive;
	
	
	
	public DriveTrain()
	{
		leftMotor = new Victor(Robot.LEFT_MOTOR);
		rightMotor = new Victor(Robot.RIGHT_MOTOR);
		drive = new RobotDrive(leftMotor, rightMotor);
	}
	
	public void drive(double move, double rotate)
	{
		drive.arcadeDrive(move, rotate);
	}
	
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

