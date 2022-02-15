package behavior.state.example1;

public class TVContext implements State {

	
	private State tvState;
	
	public State getTvState() {
		return tvState;
	}

	public void setTvState(State state) {
		this.tvState = state;
	}


	/**
	 * 현재 상태를 참조하여 상태에 대한 구현을 실행
	 */
	@Override
	public void doAction() {
		this.tvState.doAction(); 
	}

}
