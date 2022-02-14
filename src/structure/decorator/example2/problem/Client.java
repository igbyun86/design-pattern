package structure.decorator.example2.problem;

/**
 * 문제점1) 또다른 도로 표시 기능을 추가로 구현하고 싶다면? 예)기본 도로 표시에 교통량을 표시하고 싶다면?
 * 문제점2) 여러 가지 추가 기능을 조합해 제공하고 싶다면? 예)기본 도로 표시에 차선 표시기능과 교통량 표시 기능을 함께 제공하고 싶다면?
 */
public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw();    //기본도로만 표시

        RoadDisplay roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw();    //기본도로 + 차선표시
    }
}
