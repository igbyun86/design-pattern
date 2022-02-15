package creation.factory.example2.problem;

import behavior.template.example2.problem.Direction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.IntStream;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private ThroughputScheduler scheduler;

    //주어진 수만큼의 ElevatorController를 생성함
    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);
        IntStream.range(0, controllerCount).forEach(i -> {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        });

        //scheduler = new ThroughputScheduler();  //ThroughputScheduler 객체를 생성함
    }
    /*
    void requestElevator(int destination, Direction direction) {
        //ThroughputScheduler를 이용해 엘리베이터를 선택함
        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        //선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotoFloor(destination);
    }
*/
    //스케줄링 전략이 변경되거나 동적 스케줄링을 지원해야 할경우 코드 수정이 필요하다
    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;

        //0..23
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 12) {
            scheduler = new ResponseTimeScheduler();
        } else {
            scheduler = new ThroughputScheduler();
        }

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
