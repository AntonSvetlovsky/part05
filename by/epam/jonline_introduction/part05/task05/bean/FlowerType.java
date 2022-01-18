package by.epam.jonline_introduction.part05.task05.bean;

public enum FlowerType {

	ROSE, GERBERA, LILY, IRIS, DAISY;

	public static boolean checkValue(String value) {

		FlowerType[] flowerTypes = FlowerType.values();

		for (FlowerType flowerType : flowerTypes) {
			if (flowerType.toString().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}
}
