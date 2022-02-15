package behavior.state.example2;

/**
 * Robot Cook 상태
 * @author big
 *
 */
public class RoboticCook implements RoboticState {

	private final Robot robot;
	
	public RoboticCook(Robot robot) {
		this.robot = robot;
	}
	
	/**
	 * Walk 가능
	 * On 상태 변경
	 */
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(robot.getRoboticOn());
	}

	/**
	 * Cook 가능
	 */
	@Override
	public void cook() {
		System.out.println("Cooking...");
	}

	/**
	 * 요리중엔 Off 불가능
	 */
	@Override
	public void off() {
		System.out.println("Cannot switched off while cooking...");
	}

}
