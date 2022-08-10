package net.emmecilab.state;

public class Client {

	public static void main(String[] args) {

		// without State pattern
		System.out.println("Without State pattern");
		TVRemote remote = new TVRemote();
		remote.setState("ON");
		remote.doOperation();
		remote.setState("OFF");
		remote.doOperation();

		// with State pattern
		System.out.println("With State pattern");
		TVContext context = new TVContext();
		State tvOnState = new TVOnState();
		State tvOffState = new TVOffState();
		context.setState(tvOnState);
		context.doOperation();
		context.setState(tvOffState);
		context.doOperation();

	}
}
