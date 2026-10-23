package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class ControllerPractice  extends OpMode {
    @Override
    public void init() {

    }
    @Override
    public void loop(){
        //runs 50x per second
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double difference = gamepad1.left_stick_x-gamepad1.right_stick_x;
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", speedForward);
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("pitch", gamepad1.right_stick_x);
        telemetry.addData("roll", gamepad1.right_stick_y);
        telemetry.addData("b", gamepad1.b);
        telemetry.addData("difference", difference);
        telemetry.addData("Triggers", (gamepad1.left_trigger + gamepad1.right_trigger));
    }
}
