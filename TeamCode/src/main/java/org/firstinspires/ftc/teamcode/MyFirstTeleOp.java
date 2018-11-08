package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "TeleOp")
public class MyFirstTeleOp extends LinearOpMode

{
    public DcMotor MotorLeft;
    public DcMotor MotorRight;
    @Override
    public void runOpMode(){

        MotorLeft = hardwareMap.dcMotor.get("MotorLeft");
        MotorRight = hardwareMap.dcMotor.get("MotorRight");

        MotorLeft.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        while(opModeIsActive())
        {

            MotorLeft.setPower(-gamepad1.left_stick_y);
            MotorRight.setPower(-gamepad1.left_stick_y);

            idle();
    }

}
}
