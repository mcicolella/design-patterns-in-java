package net.emmecilab.state;

public class TVContext implements State {

	private State tvState;

	public void setState(State state) {
		this.tvState = state;
	}

	public State getState() {
		return this.tvState;
	}

	@Override
	public void doOperation() {
		tvState.doOperation();
	}

}
