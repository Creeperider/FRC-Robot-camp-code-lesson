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
import frc.robot.commands.ConveyorCommand;

/**
 * Add your docs here.
 */
public class ConveyorSubsystem extends Subsystem {

  private VictorSP conveyorMotor;

  public ConveyorSubsystem(){
    conveyorMotor = new VictorSP(RobotMap.conveyorMotor);
  }

  public void runConveyor(double speed) {
    conveyorMotor.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ConveyorCommand());
  }
}
