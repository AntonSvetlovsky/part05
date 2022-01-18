package by.epam.jonline_introduction.part05.task05.service;

import by.epam.jonline_introduction.part05.task05.bean.Color;
import by.epam.jonline_introduction.part05.task05.bean.DaisyFlower;
import by.epam.jonline_introduction.part05.task05.bean.Flower;
import by.epam.jonline_introduction.part05.task05.bean.FlowerType;
import by.epam.jonline_introduction.part05.task05.bean.GerberaFlower;
import by.epam.jonline_introduction.part05.task05.bean.IrisFlower;
import by.epam.jonline_introduction.part05.task05.bean.LilyFlower;
import by.epam.jonline_introduction.part05.task05.bean.RoseFlower;

public class FlowerFactoryImpl implements FlowerFactory {

	private Flower flower = null;

	@Override
	public Flower createFlower(FlowerType type, Color color) {
		if (type == FlowerType.ROSE) {
			flower = new RoseFlower(color);
		} else if (type == FlowerType.GERBERA) {
			flower = new GerberaFlower(color);
		} else if (type == FlowerType.LILY) {
			flower = new LilyFlower(color);
		} else if (type == FlowerType.IRIS) {
			flower = new IrisFlower(color);
		} else if (type == FlowerType.DAISY) {
			flower = new DaisyFlower(color);
		}
		return flower;
	}

}
