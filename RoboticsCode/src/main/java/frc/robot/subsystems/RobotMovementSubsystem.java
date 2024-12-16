package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants.MotorConstants;

public class RobotMovementSubsystem extends SubsystemBase{
    
    public TalonFX frontLeftMotor = new TalonFX(MotorConstants.kFrontLeftMotorPort);
    public TalonFX backLeftMotor = new TalonFX(MotorConstants.kBackLeftMotorPort);

    public TalonFX frontRightMotor = new TalonFX(MotorConstants.kFrontRightMotorPort);
    public TalonFX backRightMotor = new TalonFX(MotorConstants.kBackRightMotorPort);


    public RobotMovementSubsystem(){

    }

    public void setLeftMotors(double power){
        frontLeftMotor.set(power);
        backLeftMotor.set(power);
    }

    public void setRightMotors(double power){
        frontRightMotor.set(power);
        backRightMotor.set(power);
    }

    public void periodic() {
      // This method will be called once per scheduler run
    }
}
