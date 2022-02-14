package behavior.template.example2.problem;

/**
 * ������1)���� �ٸ� ȸ���� ���͸� �����ؾ� �Ѵٸ�? ��)LG���͸� ������Ű����?
 * Hyundai���Ϳ� LG������ ����� �ߺ��� �ڵ尡 ����.
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP);
    }
}
