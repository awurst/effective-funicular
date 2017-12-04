package org.usfirst.frc.team2335.robot.subsystems;

import org.usfirst.frc.team2335.robot.Robot;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem 
{
	Victor climbMotor;
	

	public Climber()
	{
		climbMotor = new Victor(Robot.CLIMB_MOTOR);
	}
	
	public void climb(double speed)
	{
		climbMotor.set(speed);
	}
	
	public void stopClimb()
	{
		climbMotor.set(0);
	}

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

