package by.epam.jonline_introduction.part05.task05.service;

public final class FlowerStoreProvider {

	private static final FlowerStoreProvider instance = new FlowerStoreProvider();
	private final FlowerStore factory = new FlowerStoreImpl();

	private FlowerStoreProvider() {
	}

	public static FlowerStoreProvider getInstance() {
		return instance;
	}

	public FlowerStore getFactory() {
		return factory;
	}
}
