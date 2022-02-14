package behavior.template.example2.solving;

import behavior.template.example2.problem.Direction;
import behavior.template.example2.problem.Door;

public class LGMotor extends Motor {

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveHyundaiMotor(Direction direction) {
        //LGMotor∏¶ ±∏µøΩ√≈¥
        System.out.println("LG Motor : " + direction);
    }
}
