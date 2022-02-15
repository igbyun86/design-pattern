package creation.factory.example2.solving;

import behavior.template.example2.problem.Direction;

/**
 * 팩토리 메서드 패턴
 * 객체의 생성 코드를 별도의 클래스/메서드로 분리함으로써 객체 생성의 변화에 대비하는데 유용하다
 */
public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
