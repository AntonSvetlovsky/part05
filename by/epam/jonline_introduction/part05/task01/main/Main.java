/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

package by.epam.jonline_introduction.part05.task01.main;

import by.epam.jonline_introduction.part05.task01.entity.Directory;
import by.epam.jonline_introduction.part05.task01.entity.TextFile;
import by.epam.jonline_introduction.part05.task01.view.DirectoryView;
import by.epam.jonline_introduction.part05.task01.view.TextFileView;

public class Main {
	public static void main(String args[]) {

		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");
		TextFile textFile1 = new TextFile("text1.txt", "Text message from text1.");
		TextFile textFile2 = new TextFile("text2.txt", "Text message from text2.");
		TextFile textFile3 = new TextFile("text3.txt", "Text message from text3.");

		dir1.addFile(textFile1);
		dir1.addFile(textFile2);
		dir1.addFile(dir2);
		dir2.addFile(textFile3);

		TextFileView textFileView = new TextFileView();
		DirectoryView dirView = new DirectoryView();

		dirView.showContent(dir1);
		dirView.showContent(dir2);

		dir2.renameFile("dir002");
		textFile3.renameFile("text003.txt");
		textFile3.addContent("Additional text message.");
		dir1.deleteFile(textFile2);

		dirView.showContent(dir1);
		dirView.showContent(dir2);

		textFileView.showContent(textFile1);
		textFileView.showContent(textFile3);

		System.out.println(textFile1.toString());
		System.out.println(dir1.toString());
	}
}
