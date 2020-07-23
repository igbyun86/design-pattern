package behavior.state.example2;

public class RoboticOff implements RoboticState {

	private final Robot robot;
	
	public RoboticOff(Robot robot) {
		this.robot = robot;
	}
	
	/**
	 * Walk ����
	 * On ���� ����
	 */
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(robot.getRoboticOn());
	}

	/**
	 * Off���¿��� Cook �Ұ���
	 */
	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
	}

	/**
	 * �̹� Off ���� �޼��� 
	 */
	@Override
	public void off() {
		System.out.println("Already switched off...");
	}

}
