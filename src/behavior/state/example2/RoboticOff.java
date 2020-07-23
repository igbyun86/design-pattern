package behavior.state.example2;

public class RoboticOff implements RoboticState {

	private final Robot robot;
	
	public RoboticOff(Robot robot) {
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
	 * Off상태에서 Cook 불가능
	 */
	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
	}

	/**
	 * 이미 Off 상태 메세지 
	 */
	@Override
	public void off() {
		System.out.println("Already switched off...");
	}

}
