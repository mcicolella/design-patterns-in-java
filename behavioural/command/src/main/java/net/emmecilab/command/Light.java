package net.emmecilab.command;

public class Light {

	boolean isOn;

	public void on() {
		isOn = true;
		System.out.println("Light is On");
	}

	public void off() {
		isOn = false;
		System.out.println("Light is Off");
	}

}
