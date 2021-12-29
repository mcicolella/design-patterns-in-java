package net.emmecilab.observer;

public interface Subject {
	public void add(Observer o);

	public void remove(Observer o);

	public void notify(Message m);
}
