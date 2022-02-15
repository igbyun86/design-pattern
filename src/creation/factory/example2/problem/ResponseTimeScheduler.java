package creation.factory.example2.problem;

import behavior.template.example2.problem.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler {

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;   //임의로 선택함
    }
}
