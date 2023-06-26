package UiWebMSys;

public class EvenOddImp {

	/*
	 * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree({2, 1, 3, 5}) → true
modThree({2, 1, 2, 5}) → false
modThree({2, 4, 2, 5}) → true
	 */
	
	public boolean modThree(int[] num) {
boolean result=false;
		
		for(int i=0;i<num.length-2;i++) {
			
			if((num[i]%2==0 ) && (num[i+1]%2==0) &(num[i+2]%2==0) || 
					
					!(num[i]%2==0) && !(num[i+1]%2==0) && !(num[i+2]%2==0)) {
				
				result= true;
			
			}
		}
		return false;
	}
		
		
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2, 1, 3, 5};
		
		new EvenOddImp().modThree(num);
		


		
	}

}
