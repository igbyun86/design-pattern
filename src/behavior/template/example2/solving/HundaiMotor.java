package behavior.template.example2.solving;

import behavior.template.example2.problem.Direction;
import behavior.template.example2.problem.Door;

public class HundaiMotor extends Motor {

    public HundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveHyundaiMotor(Direction direction) {
        //HyundaiMotor를 구동시킴
        System.out.println("Hyundai Motor : " + direction);
    }
}
