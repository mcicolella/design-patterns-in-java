package net.emmecilab.flyweight;

public class JavaPlayground implements Playground {
	public JavaPlayground() {
		System.out.println("JavaPlayground created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing Java code.");
	}
}