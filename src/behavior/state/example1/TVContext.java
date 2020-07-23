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
	 * ���� ���¸� �����Ͽ� ���¿� ���� ������ ����
	 */
	@Override
	public void doAction() {
		this.tvState.doAction(); 
	}

}
