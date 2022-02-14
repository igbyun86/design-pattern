package behavior.template.example2.problem;

public class HyundaiMotor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED; //�ʱ⿡�� ���� ����
    }

    private void moveHyundaiMotor(Direction direction) {
        //Hyundai Motor�� ������Ŵ
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;  //�̹� �̵� ���̸� �ƹ� �۾��� ���� ����

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {  //���� ���� ���� ������ �켱 ���� ����
            door.close();
        }

        moveHyundaiMotor(direction);        //���͸� �־��� �������� �̵���Ŵ
        setMotorStatus(MotorStatus.MOVING); //���� ���¸� �̵������� ������
    }
}
