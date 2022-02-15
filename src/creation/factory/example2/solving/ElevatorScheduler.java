package creation.factory.example2.solving;

import behavior.template.example2.problem.Direction;

public interface ElevatorScheduler {

    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
