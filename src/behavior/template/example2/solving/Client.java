package behavior.template.example2.solving;

import behavior.template.example2.problem.Direction;
import behavior.template.example2.problem.Door;

/**
 * 전체적으로는 동일하면서 부분적으로는 다른 구문으로 구성된
 * 메서드의 코드 중복을 최소화할 때 유용하다
 * 동일한 기능을 상위 클래스에서 정의하면서 확장/변화가 필요한 부분만 서브 클래스에서 구현할 수 있도록 한다.
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
