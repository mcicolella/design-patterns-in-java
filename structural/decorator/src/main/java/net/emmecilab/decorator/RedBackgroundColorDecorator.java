package net.emmecilab.decorator;

public class RedBackgroundColorDecorator extends ShapeDecorator {

	public RedBackgroundColorDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		setRedBackground(shape);
	}

	private void setRedBackground(Shape shape) {
		System.out.println("Background color: Red");
	}
}
