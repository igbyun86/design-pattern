package behavior.mediator.example1;

/**
 * Mediator Design Pattern Concrete Colleague
 * @author big
 *
 */
public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}
	
	@Override
	public void send(String msg) {
		System.out.println(this.name + " : Sending Message=" + msg);
		this.mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " : Received Message : " + msg);
	}

}
