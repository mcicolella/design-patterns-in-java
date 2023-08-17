package net.emmecilab.flyweight;

public class Client {

	public static void main(String[] args) {
		Code code = new Code();

		code.setCode("JAVA Code...");
		Playground playground = PlaygroundFactory.getPlayground("JAVA");
		playground.execute(code);
		System.out.println("*************************");
		
		code.setCode("PHP Code...");
		playground = PlaygroundFactory.getPlayground("PHP");
		playground.execute(code);
		System.out.println("*************************");

		code.setCode("JAVA Code...");
		playground = PlaygroundFactory.getPlayground("JAVA");
		playground.execute(code);
		System.out.println("*************************");
		
	}
}
