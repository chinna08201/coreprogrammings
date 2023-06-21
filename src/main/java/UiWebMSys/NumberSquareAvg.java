package UiWebMSys;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAvg {
	
	
	public static void main(String[] args) {
		
		
		
	List<Integer> arrayes=	Arrays.asList(1,10,20,30,15);
	
	//1,100,400,900,225
	//400,900,225
	//508.3333333333333
	
	double average=arrayes.stream().
			map(e->e*e).
				filter(e->e>100)
						.mapToInt(e->e).
						  average().
						  	getAsDouble();
	
	System.out.println(average);
		
	}

}
