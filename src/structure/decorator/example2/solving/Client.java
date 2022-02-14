package structure.decorator.example2.solving;

/**
 * �⺻ ��ɿ� �߰��� �� �ִ� ����� ������ ���� ��쿡 �� �߰� ����� Decorator Ŭ������ ������ ��
 * �ʿ��� Decorator ��ü�� ���������ν� �߰� ����� ������ �����ϴ� ����̴�.
 */
public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();    //�⺻ ���� ǥ��

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();    //�⺻ ���� ǥ�� + ���� ǥ��

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw(); //�⺻ ���� ǥ�� + ���뷮 ǥ��

        Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.draw();  //�⺻ ���� ǥ�� + ���� ǥ�� + ���뷮 ǥ��

        Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
        roadWithCrossingAndLaneAndTraffic.draw();   //�⺻ ���� ǥ�� + ���� ǥ�� + ���뷮 ǥ�� + ������ ǥ��
    }
}
