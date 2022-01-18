package by.epam.jonline_introduction.part05.task04.dao;

import by.epam.jonline_introduction.part05.task04.dao.impl.CaveDAOImpl;

public final class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();
	private final CaveDAO caveDAO = new CaveDAOImpl();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public CaveDAO getCaveDAO() {
		return caveDAO;
	}
}
