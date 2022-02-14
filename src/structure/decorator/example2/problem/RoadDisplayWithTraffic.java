package structure.decorator.example2.problem;

//�⺻���� ǥ�� + ���뷮 ǥ�� Ŭ����
public class RoadDisplayWithTraffic extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();   //���� Ŭ���� RoadDisplay�� draw �޼��带 ȣ���ؼ� �⺻ ���θ� ǥ����
        drawTraffic();  //�߰������� ���뷮�� ǥ����
    }

    private void drawTraffic() {
        System.out.println("���뷮 ǥ��");
    }
}
