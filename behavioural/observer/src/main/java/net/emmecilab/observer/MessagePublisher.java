package net.emmecilab.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notify(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}
}
