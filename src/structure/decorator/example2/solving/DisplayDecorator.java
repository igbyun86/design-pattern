package structure.decorator.example2.solving;

//�پ��� �߰� ��ɿ� ���� ���� Ŭ����
public abstract class DisplayDecorator extends Display {
    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }

}
