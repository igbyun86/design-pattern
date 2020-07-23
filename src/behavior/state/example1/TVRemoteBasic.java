package behavior.state.example1;

/**
 * ���°� �߰��Ǹ� doAction�� ������ �׻� �����ؾ��ϴ� ������ �ִ�.
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
