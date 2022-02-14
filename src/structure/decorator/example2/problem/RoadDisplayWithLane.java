package structure.decorator.example2.problem;

public class RoadDisplayWithLane extends RoadDisplay {

    @Override
    public void draw() {
        super.draw();   //상위 클래스, 즉 RoadDisplay 클래스의 draw 메서드를 호출해서 기본 도로를 표시
        drawLane();     //추가적으로 차선을 표시
    }

    private void drawLane() {
        System.out.println("차선 표시");
    }
}
