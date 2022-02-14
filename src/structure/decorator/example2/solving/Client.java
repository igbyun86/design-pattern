package structure.decorator.example2.solving;

/**
 * 기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에 각 추가 기능을 Decorator 클래스로 정의한 후
 * 필요한 Decorator 객체를 조합함으로써 추가 기능의 조합을 설계하는 방식이다.
 */
public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();    //기본 도로 표시

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();    //기본 도로 표시 + 차선 표시

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw(); //기본 도로 표시 + 교통량 표시

        Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.draw();  //기본 도로 표시 + 차선 표시 + 교통량 표시

        Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
        roadWithCrossingAndLaneAndTraffic.draw();   //기본 도로 표시 + 차선 표시 + 교통량 표시 + 교차로 표시
    }
}
