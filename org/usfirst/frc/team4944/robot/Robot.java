package org.usfirst.frc.team4944.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4944.robot.commands.ExampleCommand;
import org.usfirst.frc.team4944.robot.custom.XboxController;
import org.usfirst.frc.team4944.robot.subsystems.DriveSystem;
import org.usfirst.frc.team4944.robot.subsystems.ExampleSubsystem;


public class Robot extends TimedRobot {
	// CONTROLLERS
	XboxController driver;
	XboxController operator;
	// SUBSYSTEMS
	DriveSystem driveSystem;

	@Override
	public void robotInit() {
		// CONTROLLERS INIT
		driver = new XboxController(0);
		operator = new XboxController(1);
		// SUBSYSTEMS INIT
		driveSystem = new DriveSystem();
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run(); // KEEP HERE TO RUN COMMANDS
	}

	@Override
	public void autonomousInit() {
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run(); // KEEP HERE TO RUN COMMANDS
	}

	@Override
	public void teleopInit() {
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run(); // KEEP HERE TO RUN COMMANDS
		double Y = driver.getLeftStickY();
		double X = driver.getRightStickX();
		
		driveSystem.setPower(Y + X, Y - X);
		
	}

	@Override
	public void testPeriodic() {
	}
}
