package streamsPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStream {
	
	public static void main(String[] args) {
		
		//Print the names which last letter Y with Upper case
		/*
		 * AKSHAY
			ABHAY
			ALSHAY
		 */
		Stream.of("Akshay","Abhay","Anil","Alshay","Dad","Forum").filter(s->s.endsWith("y")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		
		/*
		 * Print the names which are starts with A and Sorting Order
		 * 
		 * 
		 */
		
		List<String> data=Arrays.asList("Akshay","Abhay","Anil","Alshay","Dad","Forum");
		//data.
		

	}

}
