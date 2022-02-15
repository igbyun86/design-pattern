package behavior.mediator.example1;

/**
 * Mediator Pattern Colleague
 * Interface 또는 abstract class로 구현
 * @author big
 *
 */
public abstract class User {
	
	protected ChatMediator mediator;
	protected String name;
	
	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
	
}
