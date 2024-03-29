/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

/**
 * Add your docs here.
 */
public class Drivesubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private VictorSP rightDrive, leftDrive; 

  public Drivesubsystem() {
rightDrive = new VictorSP(RobotMap.rightDrive);
leftDrive = new VictorSP(RobotMap.leftDrive);
  }

  public void drive(double leftPower, double rightPower){
    rightDrive.set(rightPower);
    leftDrive.set(leftPower);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  setDefaultCommand(new DriveCommand());
  }
}
