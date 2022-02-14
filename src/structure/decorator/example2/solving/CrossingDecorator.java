package structure.decorator.example2.solving;

public class CrossingDecorator extends DisplayDecorator {

    //기존의 표시 클래스를 설정
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();   //설정된 기존의 표시 기능을 실행
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("\t교차로 표시");
    }
}
