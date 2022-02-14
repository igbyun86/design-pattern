package behavior.template.example2.problem;

/**
 * 문제점1)만약 다른 회사의 모터를 제어해야 한다면? 예)LG모터를 구동시키려면?
 * Hyundai모터와 LG모터의 기능이 중복된 코드가 많다.
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP);
    }
}
