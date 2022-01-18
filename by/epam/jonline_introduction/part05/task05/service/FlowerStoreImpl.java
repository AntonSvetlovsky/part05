package by.epam.jonline_introduction.part05.task05.service;

import java.util.ArrayList;
import java.util.List;

import by.epam.jonline_introduction.part05.task05.bean.Color;
import by.epam.jonline_introduction.part05.task05.bean.Flower;
import by.epam.jonline_introduction.part05.task05.bean.FlowerComposition;
import by.epam.jonline_introduction.part05.task05.bean.FlowerType;
import by.epam.jonline_introduction.part05.task05.bean.WrapperType;

public class FlowerStoreImpl implements FlowerStore {

	private FlowerComposition composition = null;
	private final FlowerFactoryProvider flowerFactoryProvider = FlowerFactoryProvider.getInstance();
	private final FlowerFactory flowerFactory = flowerFactoryProvider.getFactory();
	private final WrapperFactoryProvider wrapperFactoryProvider = WrapperFactoryProvider.getInstance();
	private final WrapperFactory wrapperFactory = wrapperFactoryProvider.getFactory();

	private boolean checkRequest(String request, List<Integer> numbers, List<FlowerType> flowers,
			List<Color> flowerColors, WrapperType[] wrapper, Color[] wrapperColor) {

		String[] tmpRequest = request.split(";");

		if (tmpRequest.length < 2) {
			return false;
		}

		String[] tmpFlowerValues = tmpRequest[0].split(",");

		String[] tmpFlowers = new String[tmpFlowerValues.length];
		String[] tmpFlowerNumbers = new String[tmpFlowerValues.length];
		String[] tmpFlowerColors = new String[tmpFlowerValues.length];

		for (int i = 0; i < tmpFlowerValues.length; i++) {

			tmpFlowerValues[i] = tmpFlowerValues[i].trim();
			String tmp[] = tmpFlowerValues[i].split(" ");
			if (tmp.length != 3) {
				return false;
			}
			tmpFlowers[i] = tmp[0];
			tmpFlowerColors[i] = tmp[1];
			tmpFlowerNumbers[i] = tmp[2];

		}

		for (String flower : tmpFlowers) {

			if (FlowerType.checkValue(flower)) {
				flowers.add(FlowerType.valueOf(flower.toUpperCase()));
			} else {
				return false;
			}
		}

		for (String color : tmpFlowerColors) {

			if (Color.checkValue(color)) {
				flowerColors.add(Color.valueOf(color.toUpperCase()));
			} else {
				return false;
			}
		}

		for (int i = 0; i < tmpFlowerNumbers.length; i++) {
			if (tmpFlowerNumbers[i].matches("\\d+")) {
				numbers.add(Integer.parseInt(tmpFlowerNumbers[i]));
			} else {
				return false;
			}
		}

		String[] tmpWrapperValues = tmpRequest[1].trim().split(" ");
		if (tmpWrapperValues.length != 2) {
			return false;
		}
		String tmpWrapper = tmpWrapperValues[0];
		String tmpWrapperColor = tmpWrapperValues[1];

		if (WrapperType.checkValue(tmpWrapper)) {
			wrapper[0] = WrapperType.valueOf(tmpWrapper.toUpperCase());
		} else {
			return false;
		}

		if (Color.checkValue(tmpWrapperColor)) {
			wrapperColor[0] = Color.valueOf(tmpWrapperColor.toUpperCase());
		} else {
			return false;
		}

		return true;
	}

	@Override
	public FlowerComposition createFlowerComposition(String request) {

		List<Integer> numbers = new ArrayList<Integer>();
		List<FlowerType> flowers = new ArrayList<FlowerType>();
		List<Color> flowerColors = new ArrayList<Color>();
		WrapperType[] wrapper = new WrapperType[1];
		Color[] wrapperColor = new Color[1];

		if (checkRequest(request, numbers, flowers, flowerColors, wrapper, wrapperColor)) {

			List<Flower> flowerList = new ArrayList<Flower>();

			for (int i = 0; i < flowers.size(); i++) {
				for (int j = 0; j < numbers.get(i); j++) {
					flowerList.add(flowerFactory.createFlower(flowers.get(i), flowerColors.get(i)));
				}
			}

			composition = new FlowerComposition(wrapperFactory.createWrapper(wrapper[0], wrapperColor[0]), flowerList);
		}
		return composition;
	}

}
