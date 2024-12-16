package frc.robot.commands;

import java.util.function.Supplier;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RobotMovementSubsystem;

public class MovementControlsCommand extends Command{
    RobotMovementSubsystem robotMovementSubsystem;
    Supplier<Double> joystickX, joystickY;

    public MovementControlsCommand(RobotMovementSubsystem robotMovementSubsystem, Supplier<Double> joystickX, Supplier<Double> joystickY){
        this.robotMovementSubsystem = robotMovementSubsystem;
        this.joystickX = joystickX;
        this.joystickY = joystickY;

        addRequirements(robotMovementSubsystem);

    }

    // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double x = joystickX.get();
    double y = joystickY.get();

    robotMovementSubsystem.setLeftMotors(y + x);
    robotMovementSubsystem.setRightMotors(y - x);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  public boolean isFinished() {
    return false;
  }
}
