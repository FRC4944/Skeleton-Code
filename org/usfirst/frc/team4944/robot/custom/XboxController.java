package org.usfirst.frc.team4944.robot.custom;

import edu.wpi.first.wpilibj.Joystick;

public class XboxController {
	Joystick stick;
	
	public XboxController(int port) {
		this.stick = new Joystick(port);
	}
	
	public boolean getA() {
		return stick.getRawButton(1);
	}
	
	public boolean getB() {
		return stick.getRawButton(2);
	}
	
	public boolean getX() {
		return stick.getRawButton(3);
	}
	
	public boolean getY() {
		return stick.getRawButton(4);
	}
	
	public boolean getRightBumper() {
		return stick.getRawButton(6);
	}
	
	public boolean getRightMenu() {
		return stick.getRawButton(8);
	}
	
	public boolean getLeftMenu() {
		return stick.getRawButton(7);
	}
	
	public boolean getLeftBumper() {
		return stick.getRawButton(5);
	}
	
	public boolean getLeftStickButton() {
		return stick.getRawButton(9);
	}
	
	public boolean getRightStickButton() {
		return stick.getRawButton(10);
	}
	
	public double getRightTriggerAnalog() {
		return stick.getRawAxis(3);
	}
	
	public boolean getRightTriggerDown() {
		return this.getRightTriggerAnalog() >= 0.75;
	}
	
	public double getLeftTriggerAnalog() {
		return stick.getRawAxis(2);
	}
	
	public boolean getLeftTriggerDown() {
		return this.getLeftTriggerAnalog() >= 0.75;
	}
	
	public double getRightStickX() {
		return stick.getRawAxis(4);
	}
	
	public double getRightStickY() {
		return stick.getRawAxis(5);
	}
	
	public double getLeftStickX() {
		return stick.getRawAxis(0);
	}
	
	public double getLeftStickY() {
		return stick.getRawAxis(1);
	}
	
	
}
