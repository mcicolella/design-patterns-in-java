package net.emmecilab.command;

/**
 *
 * @author Mauro Cicolella
 */
public class Client {

	public static void main(String args[]) {

		RemoteControl rc = new RemoteControl();

		Light light = new Light();

		rc.setCommand(new LightOnCommand(light));
		rc.pressButton();
		rc.undo();

	}
}
