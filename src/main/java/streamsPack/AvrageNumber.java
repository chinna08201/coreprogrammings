package streamsPack;

import java.util.Arrays;
import java.util.List;

public class AvrageNumber {
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		//The average is 3.5
	double avgDouble=	list.stream().
			mapToInt(e->e).average().getAsDouble();
	System.out.println(avgDouble);
		
	}

}
