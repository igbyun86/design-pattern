package behavior.state.example2;

/**
 * Robot On 상태
 * @author big
 *
 */
public class RoboticOn implements RoboticState {

	private final Robot robot;
	
	public RoboticOn(Robot robot) {
		this.robot = robot;
	}
	
	/**
	 * Walk 가능
	 */
	@Override
	public void walk() {
		System.out.println("Walking...");
		
	}

	/**
	 * Cook 가능
	 * Cook상태 변경 
	 */
	@Override
	public void cook() {
		System.out.println("Cooking...");
		robot.setRoboticState(robot.getRoboticCook());
	}

	/**
	 * Off 가능
	 * Off 상태 변경
	 */
	@Override
	public void off() {
		robot.setRoboticState(robot.getRoboticOff());
		System.out.println("Robot is switched off");
	}

}
