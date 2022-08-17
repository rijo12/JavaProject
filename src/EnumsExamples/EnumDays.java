package EnumsExamples;

public class EnumDays {

	enum day {

		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	day days;

	public EnumDays(day days1) {

		days = days1;
	}

	public void selectDay() {

		switch (days) {

		case MONDAY:

			System.out.println("====Monday=====");

			break;
		case TUESDAY:

			System.out.println("====Tuesday=====");

			break;
		case WEDNESDAY:

			System.out.println("====Wednesday=====");

			break;
		case THURSDAY:

			System.out.println("====Thursday=====");

			break;
		case FRIDAY:

			System.out.println("====Friday=====");

			break;

		case SATURDAY:

			System.out.println("====Saturday====");

			break;

		case SUNDAY:

			System.out.println("====Sunday=====");

			break;
		}
	}
}
