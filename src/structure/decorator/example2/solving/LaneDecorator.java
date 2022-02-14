package structure.decorator.example2.solving;

//���� ǥ�ø� �߰��ϴ� Ŭ����
public class LaneDecorator extends DisplayDecorator {

    //���� ǥ�� Ŭ������ ����
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t���� ǥ��");
    }
}
