package behavior.state.example2;

/**
 * Robot On ����
 * @author big
 *
 */
public class RoboticOn implements RoboticState {

	private final Robot robot;
	
	public RoboticOn(Robot robot) {
		this.robot = robot;
	}
	
	/**
	 * Walk ����
	 */
	@Override
	public void walk() {
		System.out.println("Walking...");
		
	}

	/**
	 * Cook ����
	 * Cook���� ���� 
	 */
	@Override
	public void cook() {
		System.out.println("Cooking...");
		robot.setRoboticState(robot.getRoboticCook());
	}

	/**
	 * Off ����
	 * Off ���� ����
	 */
	@Override
	public void off() {
		robot.setRoboticState(robot.getRoboticOff());
		System.out.println("Robot is switched off");
	}

}
