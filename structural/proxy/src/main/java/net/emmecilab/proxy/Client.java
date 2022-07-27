package net.emmecilab.proxy;

public class Client {

	public static void main(String[] args) {

		Video player = new ProxyVideo("test.mp4");
		player.display();

		System.out.println("Display again");

		player.display();

	}
}
