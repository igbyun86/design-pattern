package behavior.mediator.example1;

/**
 * Mediator interface
 * @author big
 *
 */
public interface ChatMediator {

	void sendMessage(String msg, User user);
	
	void addUser(User user);
}
