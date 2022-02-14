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

    //LGMotor�� HyundaiMotor�� move �޼��忡�� ����Ǵ� �κи��� ����
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;  //�̹� �̵� ���̸� �ƹ� �۾��� ���� ����

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {  //���� ���� ���� ������ �켱 ���� ����
            door.close();
        }

        moveHyundaiMotor(direction);        //�� �޼���� HyundaiMotor�� LGMotor���� Ư��ȭ(�������̵�)��
        setMotorStatus(MotorStatus.MOVING); //���� ���¸� �̵������� ������

    }

    protected abstract void moveHyundaiMotor(Direction direction);
}
