package behavior.state.example2;

/**
 * Robot Cook ����
 * @author big
 *
 */
public class RoboticCook implements RoboticState {

	private final Robot robot;
	
	public RoboticCook(Robot robot) {
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
	 * Cook ����
	 */
	@Override
	public void cook() {
		System.out.println("Cooking...");
	}

	/**
	 * �丮�߿� Off �Ұ���
	 */
	@Override
	public void off() {
		System.out.println("Cannot switched off while cooking...");
	}

}
