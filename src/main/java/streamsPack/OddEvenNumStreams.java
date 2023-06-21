package streamsPack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumStreams {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);
		
		//Print Even Numbers using Streams, Filter e%2==0 
		
	List<Integer> evenNumbers=	list.stream()
										.filter(e-> e%2==0)
											.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//Printing the ODD number using STREAMS, e%2!=0 then ODD numbers will be printed.
		List<Integer> oddNumbers =	list.stream().filter(e->e%2!=0)
								.collect(Collectors.toList());
		
		System.out.println(oddNumbers);
	}
}
