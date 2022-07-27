package net.emmecilab.proxy;

public class RealVideo implements Video {

	private String fileName;

	public RealVideo(String fileName) {
		this.fileName = fileName;
		loadFile(fileName);
	}

	private void loadFile(String fileName) {
		System.out.println("Loading file " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying video " + fileName);

	}

}
