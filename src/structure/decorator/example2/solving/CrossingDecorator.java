package structure.decorator.example2.solving;

public class CrossingDecorator extends DisplayDecorator {

    //������ ǥ�� Ŭ������ ����
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();   //������ ������ ǥ�� ����� ����
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("\t������ ǥ��");
    }
}
