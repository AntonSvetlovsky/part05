package by.epam.jonline_introduction.part05.task01.view;

import by.epam.jonline_introduction.part05.task01.entity.*;

public class DirectoryView {

	public void showContent(Directory dir) {
		System.out.println(dir.getName().toUpperCase() + " \\");
		for (File file : dir.getList()) {
			System.out.println(file.getName());
		}
		System.out.println();
	}
}
