package behavior.template.example2.solving;

import behavior.template.example2.problem.Direction;
import behavior.template.example2.problem.Door;
import behavior.template.example2.problem.DoorStatus;
import behavior.template.example2.problem.MotorStatus;

public abstract class Motor {
    private Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    //LGMotor와 HyundaiMotor의 move 메서드에서 공통되는 부분만을 가짐
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;  //이미 이동 중이면 아무 작업을 하지 않음

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {  //만약 문이 열려 있으면 우선 문을 닫음
            door.close();
        }

        moveHyundaiMotor(direction);        //이 메서드는 HyundaiMotor와 LGMotor에서 특수화(오버라이드)됨
        setMotorStatus(MotorStatus.MOVING); //모터 상태를 이동중으로 변경함

    }

    protected abstract void moveHyundaiMotor(Direction direction);
}
