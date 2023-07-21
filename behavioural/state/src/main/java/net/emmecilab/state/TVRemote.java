package net.emmecilab.state;

public class TVRemote {
	private String state = "";

	public void setState(String state) {
		this.state = state;
	}

	public void doOperation() {
		if (state.equalsIgnoreCase("ON")) {
			System.out.println("TV turned OFF");
		} else if (state.equalsIgnoreCase("OFF")) {
			System.out.println("TV turned ON");
		}
	}
}
