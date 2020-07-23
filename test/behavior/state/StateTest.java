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
	 * 상태별로 객체를 생성하기 때문에 상태가 추가되도
	 * Context class는 변경되지 않는다.
	 * state 패턴은 if-else나 switch문을 피하는데 도움을 준다.
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
