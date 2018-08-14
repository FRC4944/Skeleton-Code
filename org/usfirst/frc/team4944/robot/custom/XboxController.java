package org.usfirst.frc.team4944.robot.custom;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
/*
 * When Creating a new XboxController: XboxController controller = new XboxController(Port#);
 * 
 * This class allows you to add commands to every button on the Xbox controller :
 * controller.addCommandToA(Command c);
 * 
 * While also providing the means to check the values for every form of input on the 
 * controller : controller.getA();
 * 
 * USE THIS INSTEAD OF A JOYSTICK
 */
public class XboxController {
	Joystick stick;
	Button A, B, X, Y, leftBumper, rightBumper, leftMenu, rightMenu, leftStick, rightStick;
	public XboxController(int port) {
		this.stick = new Joystick(port);
		this.A = new JoystickButton(stick, 1);
		this.B = new JoystickButton(stick, 2);
		this.X = new JoystickButton(stick, 3);
		this.Y = new JoystickButton(stick, 4);
		this.leftBumper = new JoystickButton(stick, 5);
		this.rightBumper = new JoystickButton(stick, 6);
		this.leftMenu = new JoystickButton(stick, 7);
		this.rightMenu = new JoystickButton(stick, 8);
		this.leftStick = new JoystickButton(stick, 9);
		this.rightStick = new JoystickButton(stick, 10);
	}
	// A BUTTON
	public void addCommandToA(Command c) {
		A.whenPressed(c);
	}
	public boolean getA() {
		return stick.getRawButton(1);
	}
	// B BUTTON
	public void addCommandToB(Command c) {
		B.whenPressed(c);
	}
	public boolean getB() {
		return stick.getRawButton(2);
	}
	// X BUTTON
	public void addCommandToX(Command c) {
		X.whenPressed(c);
	}
	
	public boolean getX() {
		return stick.getRawButton(3);
	}
	// Y BUTTON
	public void addCommandToY(Command c) {
		Y.whenPressed(c);
	}
	public boolean getY() {
		return stick.getRawButton(4);
	}
	// LEFT BUMPER
	public void addCommandToLeftBumper(Command c) {
		leftBumper.whenPressed(c);
	}
	public boolean getLeftBumper() {
		return stick.getRawButton(5);
	}
	// RIGHT BUMPER
	public void addCommandToRightBumper(Command c) {
		rightBumper.whenPressed(c);
	}
	public boolean getRightBumper() {
		return stick.getRawButton(6);
	}
	// LEFT MENU BUTTON
	public void addCommandToLeftMenu(Command c) {
		leftMenu.whenPressed(c);
	}
	public boolean getLeftMenu() {
		return stick.getRawButton(7);
	}
	// RIGHT MENU BUTTON
	public void addCommandToRightMenu(Command c) {
		rightMenu.whenPressed(c);
	}
	public boolean getRightMenu() {
		return stick.getRawButton(8);
	}
	// LEFT STICK BUTTON
	public void addCommandToLeftStick(Command c) {
		leftStick.whenPressed(c);
	}
	public boolean getLeftStickButton() {
		return stick.getRawButton(9);
	}
	// RIGHT STICK BUTTON
	public void addCommandToRightStick(Command c) {
		rightStick.whenPressed(c);
	}
	public boolean getRightStickButton() {
		return stick.getRawButton(10);
	}
	// LEFT TRIGGER
	public double getLeftTriggerAnalog() {
		return stick.getRawAxis(2);
	}
	
	public boolean getLeftTriggerDown() {
		return this.getLeftTriggerAnalog() >= 0.75;
	}
	// RIGHT TRIGGER
	public double getRightTriggerAnalog() {
		return stick.getRawAxis(3);
	}
	
	public boolean getRightTriggerDown() {
		return this.getRightTriggerAnalog() >= 0.75;
	}
	// LEFT STICK
	public double getLeftStickX() {
		return stick.getRawAxis(0);
	}
	
	public double getLeftStickY() {
		return stick.getRawAxis(1);
	}
	// RIGHT STICK
	public double getRightStickX() {
		return stick.getRawAxis(4);
	}
	
	public double getRightStickY() {
		return stick.getRawAxis(5);
	}
}
