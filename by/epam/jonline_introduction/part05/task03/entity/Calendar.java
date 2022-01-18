package by.epam.jonline_introduction.part05.task03.entity;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private int month;
	private int year;
	private List<Day> days;

	{
		days = new ArrayList<Day>();
	}

	public Calendar() {

	}

	public Calendar(int month, int year) {
		this.month = month;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public List<Day> getDays() {
		return days;
	}

	private class Day {

		private int number;
		private String dayOfWeek;
		private TypeOfDay dayType;
		private String description = "";

		@SuppressWarnings("unused")
		public Day() {
		}

		public Day(int number, String dayOfWeek, TypeOfDay dayType) {
			this.number = number;
			this.dayOfWeek = dayOfWeek;
			this.dayType = dayType;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
			result = prime * result + ((dayType == null) ? 0 : dayType.hashCode());
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + number;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			if (dayOfWeek == null) {
				if (other.dayOfWeek != null) {
					return false;
				}
			} else if (!dayOfWeek.equals(other.dayOfWeek)) {
				return false;
			}
			if (dayType != other.dayType) {
				return false;
			}
			if (description == null) {
				if (other.description != null) {
					return false;
				}
			} else if (!description.equals(other.description)) {
				return false;
			}
			if (number != other.number) {
				return false;
			}
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Day [number=" + number + ", dayOfWeek=" + dayOfWeek + ", dayType=" + dayType + ", description="
					+ description + "]";
		}

	}

	public void createCalendarForMonth() {

		int day = 1;
		LocalDate date = LocalDate.of(year, month, day);

		while (date.getMonthValue() == month) {

			if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
				days.add(new Day(date.getDayOfMonth(), date.getDayOfWeek().toString(), TypeOfDay.DAY_OFF));
			} else {
				days.add(new Day(date.getDayOfMonth(), date.getDayOfWeek().toString(), TypeOfDay.WORKDAY));
			}
			date = date.plusDays(1);
		}

	}

	public void addHoliday(int dayNumber, String holidayName, TypeOfDay type) {

		if (days.get(dayNumber - 1) != null) {
			if (days.get(dayNumber - 1).dayType == TypeOfDay.WORKDAY) {
				days.get(dayNumber - 1).dayType = type;
				days.get(dayNumber - 1).description = holidayName;
			} else {
				days.get(dayNumber - 1).description = holidayName;
			}
		} else {
			System.err.println("dayNumber is out of range.");
		}
	}

	private void printElement(int element) {
		if (element >= 10) {
			System.out.print(element);
		} else {
			System.out.print("0" + element);
		}
	}

	public void printCalendar() {
		System.out.println("Calendar for ");
		printElement(month);
		System.out.println("." + year + ":");
		for (Day day : days) {
			printElement(day.number);
			System.out.println(" " + day.dayOfWeek + " " + day.dayType.toString() + " " + day.description);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null) {
				return false;
			}
		} else if (!days.equals(other.days)) {
			return false;
		}
		if (month != other.month) {
			return false;
		}
		if (year != other.year) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [month=" + month + ", year=" + year + ", days=" + days + "]";
	}

}
