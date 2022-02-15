package creation.factory.example2.solving;

import behavior.template.example2.problem.Direction;
import creation.factory.example2.problem.ElevatorController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;

    //주어진 수만큼의 ElevatorController를 생성함
    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<>(controllerCount);
        IntStream.range(0, controllerCount).forEach(i -> {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        });

        this.strategyID = strategyID;   //스케줄링 전략을 설정함
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }


    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
