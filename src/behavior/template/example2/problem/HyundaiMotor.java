package behavior.template.example2.problem;

public class HyundaiMotor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED; //초기에는 멈춘 상태
    }

    private void moveHyundaiMotor(Direction direction) {
        //Hyundai Motor를 구동시킴
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;  //이미 이동 중이면 아무 작업을 하지 않음

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {  //만약 문이 열려 있으면 우선 문을 닫음
            door.close();
        }

        moveHyundaiMotor(direction);        //모터를 주어진 방향으로 이동시킴
        setMotorStatus(MotorStatus.MOVING); //모터 상태를 이동중으로 변경함
    }
}
