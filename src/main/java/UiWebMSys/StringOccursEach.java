package UiWebMSys;

import java.util.HashMap;

public class StringOccursEach {

	/*
	 * I/p : test , O/p - {e-1,t-2,s-1}
	 * 
	 * Algorithm
	 * 
	 * Get the String in to toCharArray User HashMap KEYS and values Use FOR loop
	 * get the each and EVery character traversing Use IF -Else condition then add
	 * the values
	 * 
	 */
	public static void eachStringOccus(String name) {

		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		char[] strArrays = name.toCharArray();

		for (char c : strArrays) {
			if (values.containsKey(c)) {
				values.put(c, values.get(c) + 1);
			} else {
				values.put(c, 1);

			}
			
		}
		
		System.out.println(name+" : "+values);
	}

	public static void main(String[] args) {

		eachStringOccus("test");
	}

}
