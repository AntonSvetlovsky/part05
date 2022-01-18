package by.epam.jonline_introduction.part05.task04.service;

import by.epam.jonline_introduction.part05.task04.service.impl.TreasureServiceImpl;

public final class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();
	private final TreasureService service = new TreasureServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public TreasureService getService() {
		return service;
	}
}
