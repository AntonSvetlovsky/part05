package by.epam.jonline_introduction.part05.task05.service;

import by.epam.jonline_introduction.part05.task05.bean.CellophaneWrapper;
import by.epam.jonline_introduction.part05.task05.bean.Color;
import by.epam.jonline_introduction.part05.task05.bean.PaperWrapper;
import by.epam.jonline_introduction.part05.task05.bean.Wrapper;
import by.epam.jonline_introduction.part05.task05.bean.WrapperType;

public class WrapperFactoryImpl implements WrapperFactory {

	private Wrapper wrapper = null;

	@Override
	public Wrapper createWrapper(WrapperType type, Color color) {

		if (type == WrapperType.PAPER) {
			wrapper = new PaperWrapper(color);
		} else if (type == WrapperType.CELLOPHANE) {
			wrapper = new CellophaneWrapper(color);
		}

		return wrapper;
	}

}
