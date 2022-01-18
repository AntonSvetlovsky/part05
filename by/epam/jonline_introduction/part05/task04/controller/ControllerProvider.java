package by.epam.jonline_introduction.part05.task04.controller;

import by.epam.jonline_introduction.part05.task04.controller.impl.TreasureControllerImpl;

public final class ControllerProvider {

	private static final ControllerProvider instance = new ControllerProvider();
	private final TreasureController controller = new TreasureControllerImpl();

	private ControllerProvider() {
	}

	public static ControllerProvider getInstance() {
		return instance;
	}

	public TreasureController getController() {
		return controller;
	}
}
