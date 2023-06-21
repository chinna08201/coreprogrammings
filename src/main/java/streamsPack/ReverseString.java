package streamsPack;

public class ReverseString {

	/*
	 * My name is Anil 
	 * yM eman si linA
	 */

	// public void rever
	public static void main(String[] args) {

		String s = "My name is Anil";

		String[] spaces = s.split(" ");
	
		
		
		

			
		for (int i = s.length()-1; i>=0;i--) {
			char charecter = s.charAt(i);
			
			System.out.print(charecter);
		}
		
		System.out.println();
		

	}


}

}
