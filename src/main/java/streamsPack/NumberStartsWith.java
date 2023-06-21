package streamsPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
	
	/*
	 * Capture all the numbers in ARRAYLIST store in asLIST under LIST<Integer> Types
	 * Use Streams, Then MAP the values of String value of E variable 
	 * Use FILTER method under starts with variable name 
	 * Use MAP covert those Strings to INTEGER::ValueOf
	 * Use Collector method to get the List and store those values in Under LIST.
	 * Then Print the values for the same.
	 */
	
	
	public void numStartsWith() {
		
		
		List<Integer> lists=Arrays.asList(7,77,717,74747,772931,71879,98,679879);
		
		List<Integer> listSeven =lists.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("7")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("Starts with number: "+listSeven);
	}
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,22,232,256,356,457,897);
		
		List<Integer> list8=list.stream().map(e->String.valueOf(e)).
									filter(e ->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		
		
		System.out.println(list8);
		
		new NumberStartsWith().numStartsWith();
		
		
	}

}
