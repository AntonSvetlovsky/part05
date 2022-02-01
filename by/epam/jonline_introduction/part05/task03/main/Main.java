/*
 * Создать класс Календарь с внутренним классом, с помощью объектов
 * которого можно хранить информацию о выходных и праздничных днях.
 */

package by.epam.jonline_introduction.part05.task03.main;

import by.epam.jonline_introduction.part05.task03.entity.Calendar;
import by.epam.jonline_introduction.part05.task03.entity.TypeOfDay;

public class Main {

	public static void main(String[] args) {

		Calendar calendar = new Calendar(1, 2022);
		calendar.createCalendarForMonth();

		calendar.addHoliday(1, "New Year's Day", TypeOfDay.DAY_OFF);
		calendar.addHoliday(7, "Orthodox Christmas Day", TypeOfDay.DAY_OFF);
		calendar.addHoliday(15, "My Cat's birthday", TypeOfDay.WORKDAY);
		calendar.addHoliday(21, "My Dog's birthday", TypeOfDay.WORKDAY);

		calendar.printCalendar();
	}
}
