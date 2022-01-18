package by.epam.jonline_introduction.part05.task04.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.jonline_introduction.part05.task04.bean.Treasure;
import by.epam.jonline_introduction.part05.task04.dao.CaveDAO;
import by.epam.jonline_introduction.part05.task04.dao.DAOProvider;
import by.epam.jonline_introduction.part05.task04.service.TreasureService;

public class TreasureServiceImpl implements TreasureService {

	private final DAOProvider provider = DAOProvider.getInstance();
	private final CaveDAO caveDAO = provider.getCaveDAO();

	@Override
	public String showAllTreasure() {

		String response = "1";
		List<Treasure> treasureList = caveDAO.loadCave().getTreasureList();

		if (treasureList != null) {
			response = "0" + " ";

			for (Treasure treasure : treasureList) {
				response += treasure.getName() + "=" + treasure.getPrice() + "|";
			}
		}
		return response;
	}

	@Override
	public String findMostExpensiveTreasure() {

		String response = "1";
		List<Treasure> treasureList = caveDAO.loadCave().getTreasureList();
		List<Treasure> requestedList = new ArrayList<Treasure>();

		treasureList.sort(Comparator.comparing((Treasure treasure) -> treasure.getPrice()));

		int i = treasureList.size() - 1;

		while (treasureList.get(i).getPrice() == treasureList.get(treasureList.size() - 1).getPrice()) {
			requestedList.add(treasureList.get(i));
			i--;
		}

		if (requestedList != null) {
			response = "0" + " ";
			for (Treasure treasure : requestedList) {
				response += treasure.getName() + "=" + treasure.getPrice() + "|";
			}
		}
		return response;
	}

	@Override
	public String findTreasureWithGivenPrice(String value) {

		String response = "1";

		if (value == null) {
			response = "3";
			return response;
		}
		double price;
		try {
			price = Double.parseDouble(value);
		} catch (NumberFormatException e) {
			response = "3";
			return response;
		}

		List<Treasure> treasureList = caveDAO.loadCave().getTreasureList();
		List<Treasure> requestedList = new ArrayList<Treasure>();

		for (Treasure treasure : treasureList) {
			if (treasure.getPrice() == price) {
				requestedList.add(treasure);
			}
		}

		if (requestedList != null) {
			response = "0" + " ";
			for (Treasure treasure : requestedList) {
				response += treasure.getName() + "=" + treasure.getPrice() + "|";
			}
		}
		return response;
	}

}
