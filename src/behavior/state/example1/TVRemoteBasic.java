package behavior.state.example1;

/**
 * 상태가 추가되면 doAction의 내용을 항상 변경해야하는 문제가 있다.
 * @author big
 *
 */
public class TVRemoteBasic {

	private String state = "";
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void doAction() {
		if ("ON".equals(state)) {
			System.out.println("TV is turned ON");
		}
		else if ("OFF".equals(state)) {
			System.out.println("TV is turned OFF");
		}
	}
	
	public static void main(String[] args) {
		TVRemoteBasic remote = new TVRemoteBasic();
		
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	}
	
}
