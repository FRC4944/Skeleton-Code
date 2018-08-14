package org.usfirst.frc.team4944.robot.custom;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

public class Motor {

	MotorType type;
	Talon talon;
	PWMTalonSRX talonSRX; //Only for PWM NOT Can
	Jaguar jag;
	VictorSP vicSP;
	PWMVictorSPX vicSPX; //Only for PWM NOT Can
	Spark spark;
	
	
	
	public Motor(MotorType type, int port) {
		this.type = type;
		if(type == MotorType.Talon) {
			talon = new Talon(port);
		}else if(type == MotorType.TalonSRX) {
			talonSRX = new PWMTalonSRX(port);
		}else if(type == MotorType.Jaguar) {
			jag = new Jaguar(port);
		}else if(type == MotorType.SPARK) {
			spark = new Spark(port);
		}else if(type == MotorType.VictorSP) {
			vicSP = new VictorSP(port);
		}else if(type == MotorType.VictorSPX) {
			vicSPX = new PWMVictorSPX(port);
		}
	}
	
	public void setPower(double power) {
		if(type == MotorType.Talon) {
			talon.set(power);
		}else if(type == MotorType.TalonSRX) {
			talonSRX.set(power);
		}else if(type == MotorType.Jaguar) {
			jag.set(power);
		}else if(type == MotorType.SPARK) {
			spark.set(power);
		}else if(type == MotorType.VictorSP) {
			vicSP.set(power);
		}else if(type == MotorType.VictorSPX) {
			vicSPX.set(power);
		}
	}
	
	public void setInverted(boolean set) {
		if(type == MotorType.Talon) {
			talon.setInverted(set);
		}else if(type == MotorType.TalonSRX) {
			talonSRX.setInverted(set);
		}else if(type == MotorType.Jaguar) {
			jag.setInverted(set);
		}else if(type == MotorType.SPARK) {
			spark.setInverted(set);
		}else if(type == MotorType.VictorSP) {
			vicSP.setInverted(set);
		}else if(type == MotorType.VictorSPX) {
			vicSPX.setInverted(set);
		}
	}
	
}
