package by.epam.jonline_introduction.part05.task04.bean;

import java.util.ArrayList;
import java.util.List;

public class Cave {

	private List<Treasure> treasureList;

	{
		treasureList = new ArrayList<Treasure>();
	}

	public Cave() {

	}

	public Cave(List<Treasure> treasureList) {
		this.treasureList = treasureList;
	}

	public List<Treasure> getTreasureList() {
		return treasureList;
	}

	public void setTreasureList(List<Treasure> treasureList) {
		this.treasureList = treasureList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasureList == null) ? 0 : treasureList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cave other = (Cave) obj;
		if (treasureList == null) {
			if (other.treasureList != null) {
				return false;
			}
		} else if (!treasureList.equals(other.treasureList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Cave [treasureList=" + treasureList + "]";
	}

}
