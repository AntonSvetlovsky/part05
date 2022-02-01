package by.epam.jonline_introduction.part05.task04.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.epam.jonline_introduction.part05.task04.controller.ControllerProvider;
import by.epam.jonline_introduction.part05.task04.controller.TreasureController;

public class TreasureView {

	private static final ControllerProvider instance = ControllerProvider.getInstance();
	private final TreasureController controller = instance.getController();
	private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void show() {

		try (reader) {
			boolean flag = true;
			while (flag) {
				printMessage("Welcome to the Dragon cave with treasures!!!" + "\n" + "-".repeat(48) + "\n"
						+ " ".repeat(15) + "Available Options" + " ".repeat(16) + "\n" + "-".repeat(48) + "\n"
						+ "1. Show All The Treasures In The Cave." + "\n" + "2. Find The Most Expensive Treasure."
						+ "\n" + "3. Find A Treasure At A Specified Price." + "\n"
						+ "   Enter Requested Price After The Number Of Your Choice." + "\n"
						+ "   Your Choice And Price Should Be Separated By 'Space' Symbol." + "\n" + "4. Exit." + "\n"
						+ "-".repeat(48) + "\n" + "Enter Your Choice:" + "\n");

				printMessage(">>");
				String request = reader.readLine();

				String response = controller.doAction(request);
				String[] result = response.split(" ");
				String key = result[0];
				String[] tmpResult;

				switch (key) {
				case "0":
					tmpResult = response.trim().split("\\s+");

					if (tmpResult.length < 2) {
						printMessage("Error. Request Has No Matches.");
					} else {
						printTreasure(result[1]);
					}
					break;
				case "1":
					printMessage("Error1");
					break;
				case "2":
					printMessage("Error2");
					break;
				case "3":
					printMessage("Error3");
					break;
				case "4":
					printMessage("Exit.");
					flag = false;
					break;
				default:
					printMessage("Error");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void printMessage(String message) {
		System.out.println(message);
	}

	private void printTreasure(String result) {

		System.out.printf("%16s%16s", "TREASURE NAME", "TREASURE PRICE");
		System.out.println();
		String[] treasureArray = result.split("\\|");
		for (String treasure : treasureArray) {
			String[] nameAndPrice = treasure.split("=");
			System.out.printf("%16s%16s", nameAndPrice[0], nameAndPrice[1]);
			System.out.println();
		}
	}
}
