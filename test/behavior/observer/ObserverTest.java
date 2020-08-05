package behavior.observer;

import org.junit.Test;

import behavior.observer.example1.MyTopic;
import behavior.observer.example1.MyTopicSubscriber;
import behavior.observer.example1.Observer;

public class ObserverTest {

	@Test
	public void topicTest() {
		MyTopic topic = new MyTopic();
		Observer subscriber1 = new MyTopicSubscriber("������1");
		Observer subscriber2 = new MyTopicSubscriber("������2");
		Observer subscriber3 = new MyTopicSubscriber("������3");
		Observer subscriber4 = new MyTopicSubscriber("������4");
		
		topic.register(subscriber1);
		topic.register(subscriber2);
		topic.register(subscriber3);
		topic.register(subscriber4);
		
		subscriber1.setSubject(topic);
		subscriber2.setSubject(topic);
		subscriber3.setSubject(topic);
		subscriber4.setSubject(topic);
		
		subscriber1.update();
		
		topic.postMessage("���ο� ������ ������Ʈ �Ǿ����ϴ�!");
	}
}
