// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1073.PWMTest;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainfrontRight;
    public static SpeedController driveTrainbackRight;
    public static SpeedController driveTrainfrontLeft;
    public static SpeedController driveTrainbackLeft;
    public static RobotDrive driveTrainmecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainfrontRight = new Jaguar(3);
        LiveWindow.addActuator("DriveTrain", "frontRight", (Jaguar) driveTrainfrontRight);
        
        driveTrainbackRight = new Jaguar(2);
        LiveWindow.addActuator("DriveTrain", "backRight", (Jaguar) driveTrainbackRight);
        
        driveTrainfrontLeft = new Jaguar(0);
        LiveWindow.addActuator("DriveTrain", "frontLeft", (Jaguar) driveTrainfrontLeft);
        
        driveTrainbackLeft = new Jaguar(1);
        LiveWindow.addActuator("DriveTrain", "backLeft", (Jaguar) driveTrainbackLeft);
        
        driveTrainmecanumDrive = new RobotDrive(driveTrainfrontLeft, driveTrainbackLeft,
              driveTrainfrontRight, driveTrainbackRight);
        
        driveTrainmecanumDrive.setSafetyEnabled(true);
        driveTrainmecanumDrive.setExpiration(0.1);
        driveTrainmecanumDrive.setSensitivity(0.5);
        driveTrainmecanumDrive.setMaxOutput(1.0);
        driveTrainmecanumDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainmecanumDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
