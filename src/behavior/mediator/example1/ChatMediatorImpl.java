package behavior.mediator.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator
 * @author big
 *
 */
public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		users.stream()
					.filter(u -> u != user)
					.forEach(u -> {
						u.receive(msg);
					});
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

}
