package streamsPack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class DuplicateNumbers {
	/*
	 * Use Collections.frequency method type
	 */
	public static void main(String[] args) {
		
		//1st Type
		List<Integer> values= Arrays.asList(1,2,2,3,1,4,3,5,6,5);
		Set<Integer> duplicateValues=values.stream().filter(e->Collections.frequency(values, e)>1).collect(Collectors.toSet());
		System.out.println(duplicateValues);
		
		//2nd Type
		
		
	}

}
