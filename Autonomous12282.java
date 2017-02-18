package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Autonomous")
public class Autonomous12282 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor leftDrive = hardwareMap.dcMotor.get("left_drive");
        DcMotor leftDrive2 = hardwareMap.dcMotor.get("left_drive2");
        DcMotor rightDrive = hardwareMap.dcMotor.get("right_drive");
        DcMotor rightDrive2 = hardwareMap.dcMotor.get("right_drive2");

        waitForStart();

        leftDrive.setPower(1.0f);
        leftDrive2.setPower(1.0f);
        rightDrive.setPower(-1.0f);
        rightDrive2.setPower(-1.0f);

        Thread.sleep(2300);

        leftDrive.setPower(0.0f);
        leftDrive2.setPower(0.0f);
        rightDrive.setPower(-0.0f);
        rightDrive2.setPower(-0.0f);
        // stole ur code idiot
    }
}