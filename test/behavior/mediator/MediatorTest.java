package behavior.mediator;

import org.junit.Test;

import behavior.mediator.example1.ChatMediator;
import behavior.mediator.example1.ChatMediatorImpl;
import behavior.mediator.example1.User;
import behavior.mediator.example1.UserImpl;

/**
 * ��ü���� ����� �����Ѱ�� ���
 * Observer pattern�� �ٸ��� ���� �����ϴ� �����̴�.
 * @author big
 *
 */
public class MediatorTest {

	@Test
	public void chatMediatorTest() {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "���缮");
		User user2 = new UserImpl(mediator, "�ڸ��");
		User user3 = new UserImpl(mediator, "������");
		User user4 = new UserImpl(mediator, "����");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("��� �ȳ�!");
	}
}
