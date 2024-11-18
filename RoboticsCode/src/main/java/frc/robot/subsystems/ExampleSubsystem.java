
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import frc.robot.Constants.MotorConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  private final CANSparkMax Motor;

  public ExampleSubsystem() {
    Motor = new CANSparkMax(MotorConstants.kMotorID, CANSparkMax.MotorType.kBrushless); 
  }

  public void setMotorSpeed(double speed){
    Motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
