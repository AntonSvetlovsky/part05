package by.epam.jonline_introduction.part05.task04.controller.impl;

import by.epam.jonline_introduction.part05.task04.controller.Command;

public class ExitCommand implements Command {

	@Override
	public String execute(String[] params) {

		return "4";
	}

}
