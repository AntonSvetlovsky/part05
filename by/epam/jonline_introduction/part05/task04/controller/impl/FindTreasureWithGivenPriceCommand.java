package by.epam.jonline_introduction.part05.task04.controller.impl;

import by.epam.jonline_introduction.part05.task04.controller.Command;
import by.epam.jonline_introduction.part05.task04.service.ServiceProvider;
import by.epam.jonline_introduction.part05.task04.service.TreasureService;

public class FindTreasureWithGivenPriceCommand implements Command {

	@Override
	public String execute(String[] params) {

		ServiceProvider provider = ServiceProvider.getInstance();
		TreasureService service = provider.getService();

		return service.findTreasureWithGivenPrice(params[1]);
	}

}
