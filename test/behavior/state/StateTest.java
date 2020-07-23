package behavior.state;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import behavior.state.example1.State;
import behavior.state.example1.TVContext;
import behavior.state.example1.TVStartState;
import behavior.state.example1.TVStopState;
import behavior.state.example2.Robot;

public class StateTest {

	/**
	 * ���º��� ��ü�� �����ϱ� ������ ���°� �߰��ǵ�
	 * Context class�� ������� �ʴ´�.
	 * state ������ if-else�� switch���� ���ϴµ� ������ �ش�.
	 */
	@Test
	public void TVRemoteTest() {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		context.setTvState(tvStartState);
		Assertions.assertTrue(context.getTvState() instanceof TVStartState);
		context.doAction();		// TV is turned ON
		
		context.setTvState(tvStopState);
		Assertions.assertTrue(context.getTvState() instanceof TVStopState);
		context.doAction();		// TV is turned OFF
		
	}
	
	@Test
	public void RobotTest() {
		Robot robot = new Robot();
		robot.walk();
		robot.cook();
		robot.walk();
		robot.off();
		
		robot.walk();
		robot.off();
		robot.cook();
	}
	
	
}
