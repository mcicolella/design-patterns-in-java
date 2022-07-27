package net.emmecilab.proxy;

public class ProxyVideo implements Video {

	private String fileName;
	private RealVideo realVideo;

	public ProxyVideo(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realVideo == null) {
			realVideo = new RealVideo(fileName);
		}
		realVideo.display();
	}

}
