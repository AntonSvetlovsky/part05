package by.epam.jonline_introduction.part05.task05.service;

public final class FlowerFactoryProvider {

	private static final FlowerFactoryProvider instance = new FlowerFactoryProvider();
	private final FlowerFactory factory = new FlowerFactoryImpl();

	private FlowerFactoryProvider() {
	}

	public static FlowerFactoryProvider getInstance() {
		return instance;
	}

	public FlowerFactory getFactory() {
		return factory;
	}
}
