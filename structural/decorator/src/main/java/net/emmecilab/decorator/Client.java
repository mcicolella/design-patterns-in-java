package net.emmecilab.decorator;

public class Client {

	public static void main(String[] args) {

		Shape shape = new WhiteBorderColorDecorator(new RedBackgroundColorDecorator(new Circle()));
		
		shape.draw();

	}
}
