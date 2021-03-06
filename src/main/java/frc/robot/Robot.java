// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private static final Boolean False = null;
  public static TalonFX motor1 = new TalonFX(45);
  public static XboxController controller = new XboxController(0);
  public static TalonSRX motor2 = new TalonSRX(55);
  public static TalonFX talon = new TalonFX (46);
  double percent  =.4;
  
  
  




  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {}

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
    //m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    //System.out.println("Auto selected: " + m_autoSelected);
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    //switch (m_autoSelected) {
      //case kCustomAuto:
        // Put custom auto code here
        //break;
      //case kDefaultAuto:
      //default:
        // Put default auto code here
        //break;
    //}
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() { 
    

    double rpm;
 
  
  controller.
  
  if(controller.getAButton()) {
    motor1.set(ControlMode.PercentOutput, -percent);
    rpm = motor1.getSelectedSensorVelocity(); 
    System.out.println(rpm); 
    int pov= controller.getPOV(); 
      if(pov == 0){
        percent = percent + 0.01;
      if(percent > 1){percent = 1;}
         }else if(pov == 180){
            percent = percent - 0.01;
      if(percent < 0){percent = 0;}
    } }else{       motor1.set(ControlMode.PercentOutput, 0);     } 
  

    Boolean Toggle = False;
    if (joystick.getRawButton Pressed(0)) {
       if (Toggle = False) {
        motor1.set(ControlMode.PercentOutput, -percent); 
        Toggle = false; 
       } else {
          deployIntake();
          Toggle = true;  
      }
    }







  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
