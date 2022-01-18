package by.epam.jonline_introduction.part05.task01.view;

import by.epam.jonline_introduction.part05.task01.entity.*;

public class TextFileView {

	public void showContent(TextFile textFile) {
		System.out.println(textFile.getName().toUpperCase() + " :");
		System.out.println(textFile.getContent());
		System.out.println();
	}
}
