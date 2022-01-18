package by.epam.jonline_introduction.part05.task04.controller;

import java.util.HashMap;
import java.util.Map;

import by.epam.jonline_introduction.part05.task04.controller.impl.ExitCommand;
import by.epam.jonline_introduction.part05.task04.controller.impl.FindMostExpensiveTreasureCommand;
import by.epam.jonline_introduction.part05.task04.controller.impl.FindTreasureWithGivenPriceCommand;
import by.epam.jonline_introduction.part05.task04.controller.impl.ShowAllTreasureCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put("1", new ShowAllTreasureCommand());
		commands.put("2", new FindMostExpensiveTreasureCommand());
		commands.put("3", new FindTreasureWithGivenPriceCommand());
		commands.put("4", new ExitCommand());
	}

	public Command getCommand(String commandName) {

		Command command;
		command = commands.get(commandName);

		return command;
	}
}
