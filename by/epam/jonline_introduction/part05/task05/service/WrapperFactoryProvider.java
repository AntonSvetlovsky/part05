package by.epam.jonline_introduction.part05.task05.service;

public final class WrapperFactoryProvider {

	private static final WrapperFactoryProvider instance = new WrapperFactoryProvider();
	private final WrapperFactory factory = new WrapperFactoryImpl();

	private WrapperFactoryProvider() {
	}

	public static WrapperFactoryProvider getInstance() {
		return instance;
	}

	public WrapperFactory getFactory() {
		return factory;
	}
}
