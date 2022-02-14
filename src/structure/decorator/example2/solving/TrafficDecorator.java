package structure.decorator.example2.solving;

//���뷮 ǥ�ø� �߰��ϴ� Ŭ����
public class TrafficDecorator extends DisplayDecorator {

    //���� ǥ�� Ŭ������ ����
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();   //������ ���� ǥ�� ����� ����
        drawTraffic();  //�߰������� ���뷮�� ǥ��
    }

    private void drawTraffic() {
        System.out.println("\t���뷮 ǥ��");
    }
}
