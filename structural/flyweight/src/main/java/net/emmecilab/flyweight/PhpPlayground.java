package net.emmecilab.flyweight;

public class PhpPlayground implements Playground {
	public PhpPlayground() {
		System.out.println("PhpPlayground created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing Php code.");
	}
}
