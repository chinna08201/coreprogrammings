package UiWebMSys;

import java.util.Arrays;

public class AnagramExple {
	
	// Listen Silent
	//Art Rat
	
	/*
	 * Algorithm 
	 * 1. Remove white spaces
	 * 2. Check the length if matches then TRUE or FALSE
	 * 3. Then check the charecters for both Strings
	 * 4. Using Arrays.swap can we can verify is ANAGRAM or NOT
	 */
	
	public static boolean isAnagram(String s1, String s2) {
		
		String str1=s1.replace("\\s", "");
		String str2=s2.replace("\\s", "");
		
		if(str1.length()!=str2.length()) {
			
			return false;
		}else {
			char a1[]=str1.toLowerCase().toCharArray();
			char a2[]=str2.toLowerCase().toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			
			return Arrays.equals(a1, a2);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(isAnagram("Listen", "SILENT"));
		
		System.out.println(isAnagram("Lis ten  ", "SILENTe"));
		
	}

}
