package UiWebMSys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNum {
	
	
	public static void main(String[] args) {
		
		
	List<Integer> list=Arrays.asList(1,2,5,6,33,55,66,88,4,7,3,2,99);
	
	//get the First five numbers from the list
	List<Integer> values=list.stream().limit(5).collect(Collectors.toList());
	System.out.println(values);
	
	//Get the SUM of First FIVE Numbers
	
	int sum=list.stream().limit(5).reduce(((p,q) -> p+q)).get();
	System.out.println(sum);
	
	//SKIP the first FIVE Numbers
	List<Integer> skipValues=list.stream().skip(5).collect(Collectors.toList());
	System.out.println(skipValues);
	
	//Get the SUM of remain values of SKIPPING 5 numbers
	
	int skipSum=list.stream().skip(5).reduce((p,q) -> p+q).get();
	System.out.println(skipSum);
	
	
	
	}

}
