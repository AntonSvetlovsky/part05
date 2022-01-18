package by.epam.jonline_introduction.part05.task05.bean;

public enum Color {

	WHITE, RED, PINK, YELLOW;

	public static boolean checkValue(String value) {

		Color[] colorTypes = Color.values();

		for (Color colorType : colorTypes) {
			if (colorType.toString().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

}
