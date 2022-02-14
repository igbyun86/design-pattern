package behavior.template.example2.problem;

public class LGMotor {
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    private void moveLGMotor(Direction direction) {
        //LG Motor를 구동시킴
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveLGMotor(direction);                 //move메서드는 이 문장을 제외하면 HyundaiMotor와 동일함
        setMotorStatus(MotorStatus.MOVING);
    }
}
