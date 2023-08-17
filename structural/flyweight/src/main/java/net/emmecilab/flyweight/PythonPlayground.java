package net.emmecilab.flyweight;

public class PythonPlayground implements Playground {
	public PythonPlayground() {
		System.out.println("PyhonPlayground created");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing Python code.");
	}
}