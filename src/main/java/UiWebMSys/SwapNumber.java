package UiWebMSys;

public class SwapNumber {
	
	public static void main(String[] args) {
		
		//Logic 1 - Use Temp variable
		
		int a=10, b=20;
		
		System.out.println("Before swapping "+a+" "+b);
		/*
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping "+a+" "+b);
		*/
		
		//Logic 2 - use + and - Operators to swap
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping "+a+ " "+b);
	}
}
		