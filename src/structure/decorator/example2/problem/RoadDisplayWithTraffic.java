package structure.decorator.example2.problem;

//기본도로 표시 + 교통량 표시 클래스
public class RoadDisplayWithTraffic extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();   //상위 클래스 RoadDisplay의 draw 메서드를 호출해서 기본 도로를 표시함
        drawTraffic();  //추가적으로 교통량을 표시함
    }

    private void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
