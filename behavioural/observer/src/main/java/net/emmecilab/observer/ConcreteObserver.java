package net.emmecilab.observer;

public class ConcreteObserver implements Observer {
	private String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(Message m) {
		System.out.println(name + ": received message: " + m.getMessageContent());
	}
}
