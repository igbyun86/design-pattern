package behavior.mediator;

import org.junit.Test;

import behavior.mediator.example1.ChatMediator;
import behavior.mediator.example1.ChatMediatorImpl;
import behavior.mediator.example1.User;
import behavior.mediator.example1.UserImpl;

/**
 * 객체간의 통신이 복잡한경우 사용
 * Observer pattern과 다르게 서로 관찰하는 형태이다.
 * @author big
 *
 */
public class MediatorTest {

	@Test
	public void chatMediatorTest() {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "유재석");
		User user2 = new UserImpl(mediator, "박명수");
		User user3 = new UserImpl(mediator, "정형돈");
		User user4 = new UserImpl(mediator, "하하");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("모두 안녕!");
	}
}
