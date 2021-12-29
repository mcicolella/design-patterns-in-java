package net.emmecilab.observer;

/**
 *
 * @author Mauro Cicolella
 */
public class Client {

	public static void main(String[] args) {
		ConcreteObserver o1 = new ConcreteObserver("Observer 1");

		MessagePublisher p = new MessagePublisher();

		p.add(o1);

		p.notify(new Message("First Message"));

		p.remove(o1);

		p.notify(new Message("Second Message"));

	}
}
