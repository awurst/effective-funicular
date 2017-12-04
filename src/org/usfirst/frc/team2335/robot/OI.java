package org.usfirst.frc.team2335.robot;

import org.usfirst.frc.team2335.robot.commands.Climb;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	Joystick stick;
	JoystickButton climbButton;
	
	public OI()
	{
		stick = new Joystick(Robot.JOYSTICK_PORT);
		climbButton = new JoystickButton(stick, Robot.CLIMB_BUTTON);
		
		climbButton.whileHeld(new Climb());
	}
	
	public double getAxis(int axis)
	{
		return stick.getRawAxis(axis);
	}
}
