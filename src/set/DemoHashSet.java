package set;

import java.util.*;

public class DemoHashSet {

	// Java Program Demonstrating Working of Set by
	// Adding elements using add() method

	// Importing all utility classes

	// Main class

	// Main driver method
	public static void main(String[] args) {
		// Creating an object of Set and
		// declaring object of type String
		Set<String> set = new HashSet<String>();

		// Adding elements to above object
		// using add() method
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple");

		// Printing the elements inside the Set object
		System.out.println(set);
	}
}
