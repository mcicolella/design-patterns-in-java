package net.emmecilab.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class PlaygroundFactory {

	private static Map<String, Playground> map = new HashMap<>();

	private PlaygroundFactory() {
		throw new AssertionError("Cannot instantiate the class");
	}

	public static synchronized Playground getPlayground(String playgroundType) {
		Playground playground = map.get(playgroundType);

		if (playground == null) {
			switch (playgroundType) {

			case "JAVA":
				playground = new JavaPlayground();
				break;

			case "PHP":
				playground = new PhpPlayground();
				break;

			case "PYTHON":
				playground = new PythonPlayground();
				break;

			}
			map.put(playgroundType, playground);
		}
		return playground;
	}
}