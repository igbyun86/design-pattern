package structure.decorator.example2.problem;

public class RoadDisplayWithLane extends RoadDisplay {

    @Override
    public void draw() {
        super.draw();   //���� Ŭ����, �� RoadDisplay Ŭ������ draw �޼��带 ȣ���ؼ� �⺻ ���θ� ǥ��
        drawLane();     //�߰������� ������ ǥ��
    }

    private void drawLane() {
        System.out.println("���� ǥ��");
    }
}
