package behavior.template.example2.solving;

import behavior.template.example2.problem.Direction;
import behavior.template.example2.problem.Door;

/**
 * ��ü�����δ� �����ϸ鼭 �κ������δ� �ٸ� �������� ������
 * �޼����� �ڵ� �ߺ��� �ּ�ȭ�� �� �����ϴ�
 * ������ ����� ���� Ŭ�������� �����ϸ鼭 Ȯ��/��ȭ�� �ʿ��� �κи� ���� Ŭ�������� ������ �� �ֵ��� �Ѵ�.
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        Motor hundaiMotor = new HundaiMotor(door);
        hundaiMotor.move(Direction.UP);

        Motor lgMotor = new LGMotor(door);
        lgMotor.move(Direction.DOWN);
    }
}
