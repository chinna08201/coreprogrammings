package UiWebMSys;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		
		/**
		 * Anil Kumar wanted to reverse it
		 * The Given String : Anil Kumar
The reverse String Output : linA ramuK 
		 * 
		 * 1. Store in String and split using space
		 * 2. use for loop and reverse it using charAT function
		 */
		
		String name="My name is Anil Kumar";
		System.out.println("The Given String : "+name);
		String words[]=name.split(" ");
		
		String outPut="";
		for(String word:words) {
			
			String rev="";
			
			for(int i=word.length()-1;i>=0;i--) {
				rev=rev+word.charAt(i);
			}
			
			outPut=outPut+rev+" ";
		}
		
		System.out.println("The reverse String Output : "+outPut);
		
		
	}

}
