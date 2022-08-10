package net.emmecilab.state;

public class TVOnState implements State {

	@Override
	public void doOperation() {
		System.out.println("TV turned ON");
	}

}
