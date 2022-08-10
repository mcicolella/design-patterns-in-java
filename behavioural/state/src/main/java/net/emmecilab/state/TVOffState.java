package net.emmecilab.state;

public class TVOffState implements State {

	@Override
	public void doOperation() {
		System.out.println("TV turned OFF");
	}

}
