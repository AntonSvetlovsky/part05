package by.epam.jonline_introduction.part05.task04.controller.impl;

import by.epam.jonline_introduction.part05.task04.controller.Command;
import by.epam.jonline_introduction.part05.task04.controller.CommandProvider;
import by.epam.jonline_introduction.part05.task04.controller.TreasureController;

public class TreasureControllerImpl implements TreasureController {

	private final CommandProvider provider = new CommandProvider();

	@Override
	public String doAction(String request) {
		String[] params = new String[2];
		String[] tmpArray;
		String commandName;

		request = request.trim();
		tmpArray = request.split("\\s+");

		for (int i = 0; i < params.length; i++) {
			if (i < tmpArray.length) {
				params[i] = tmpArray[i];
			}
		}

		commandName = params[0];

		Command currentCommand = provider.getCommand(commandName);
		String response;

		if (currentCommand == null) {
			response = "2";
			return response;
		}

		response = currentCommand.execute(params);

		return response;
	}

}
