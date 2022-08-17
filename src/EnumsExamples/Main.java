package EnumsExamples;

import EnumsExamples.EnumDays.day;

public class Main {

	public static void main(String[] args) {

		// Enum colors
		EnumConcepts enumConcept = new EnumConcepts();

		enumConcept.allOfMethod();

		enumConcept.noneOfMethod();

		enumConcept.rangeMethod();

		enumConcept.ofMethod();

		enumConcept.ofMultipleMethod();

		enumConcept.addAndAddAllMetod();

		enumConcept.removeAndRemoveAllMetod();

		enumConcept.iteratorMethod();

		// Enum Days

		EnumDays enumexample = new EnumDays(day.MONDAY);

		enumexample.selectDay();

	}

}
