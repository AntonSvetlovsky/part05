package by.epam.jonline_introduction.part05.task05.bean;

public enum WrapperType {

	PAPER, CELLOPHANE;

	public static boolean checkValue(String value) {

		WrapperType[] wrapperTypes = WrapperType.values();

		for (WrapperType wrapperType : wrapperTypes) {
			if (wrapperType.toString().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}
}
