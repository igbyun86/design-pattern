package structure.decorator.example2.solving;

//차선 표시를 추가하는 클래스
public class LaneDecorator extends DisplayDecorator {

    //기존 표시 클래스의 설정
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }
}
