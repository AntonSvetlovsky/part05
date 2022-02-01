package by.epam.jonline_introduction.part05.task04.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.jonline_introduction.part05.task04.bean.Cave;
import by.epam.jonline_introduction.part05.task04.bean.Treasure;
import by.epam.jonline_introduction.part05.task04.dao.CaveDAO;

public class CaveDAOImpl implements CaveDAO {

	private Cave cave;

	@Override
	public Cave loadCave() {
		if (cave == null) {
			cave = new Cave(loadTreasureList());
		}
		return cave;
	}

	private List<Treasure> loadTreasureList() {

		List<Treasure> treasureList = new ArrayList<Treasure>();
		String[] tmpArray;

		try (BufferedReader reader = new BufferedReader(new FileReader("resources\\treasureData.txt"))) {
			String tmp;
			while ((tmp = reader.readLine()) != null) {
				tmpArray = tmp.split(" ", 2);
				treasureList.add(new Treasure(tmpArray[0], Double.parseDouble(tmpArray[1])));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return treasureList;
	}
}
