package UiWebMSys;

import java.util.Scanner;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter a Number ");
		int value=sc.nextInt();
		
		int rev=0;
		while(value!=0) {
			rev=rev*10+value%10;
			
			value=value/10;
		}
		
		
		System.out.println("Reverse Number "+rev);
		
	}
	
	

}
