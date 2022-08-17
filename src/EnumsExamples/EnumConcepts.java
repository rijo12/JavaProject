package EnumsExamples;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumConcepts {

	enum color {

		RED, VIOLET, BLUE, YELLOW, WHITE, PINK, purple;

	}

	// allof Method

	public void allOfMethod() {

		EnumSet<color> colors = EnumSet.allOf(color.class);

		System.out.println(colors);

	}

	// Blank Enum Set
	public void noneOfMethod() {

		EnumSet<color> colors = EnumSet.noneOf(color.class);

		System.out.println(colors);

	}

	// Range

	public void rangeMethod() {

		EnumSet<color> range1 = EnumSet.range(color.RED, color.PINK);

		System.out.println(range1);

		EnumSet<color> range2 = EnumSet.range(color.BLUE, color.WHITE);

		System.out.println(range2);
	}

	// Enumset with a specific enum using of method

	public void ofMethod() {

		EnumSet<color> redColor = EnumSet.of(color.RED);

		System.out.println(redColor);

		EnumSet<color> pinkColor = EnumSet.of(color.PINK);

		System.out.println(pinkColor);
	}

	// Creating EnumSet with mutiple values

	public void ofMultipleMethod() {

		EnumSet<color> redBlueColor = EnumSet.of(color.RED, color.BLUE);

		System.out.println(redBlueColor);

	}

	// add and addall methods

	public void addAndAddAllMetod() {

		EnumSet<color> color1 = EnumSet.allOf(color.class);

		EnumSet<color> color2 = EnumSet.noneOf(color.class);

		color2.add(color.BLUE);

		System.out.println(color2);

		color2.addAll(color1);

		System.out.println("After adding All Colours: " + color2);

	}
	
	//remove and removeallMethod
	
	public void removeAndRemoveAllMetod() {

		EnumSet<color> color1 = EnumSet.allOf(color.class);
		
		boolean removeColor=color1.remove(color.RED);
		
		System.out.println("Red color Removed: "+removeColor);
		
		System.out.println("After removing Red Color: "+color1);
		
		boolean removeAllColor=color1.removeAll(color1);
		
		System.out.println("All colors Removed: "+removeAllColor);
		
		System.out.println("After removing all Colors: "+color1);
		
	}
	// iterator

	public void iteratorMethod() {

		EnumSet<color> allColors = EnumSet.allOf(color.class);

		Iterator<color> iter = allColors.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());

		}
	}

}