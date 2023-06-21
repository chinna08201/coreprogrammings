package UiWebMSys;

public class DuplicateStringInArray {

	
	/*
	 * store the strings in array
	 * Use TWO for loops
	 * Then took Boolean flag is false
	 * then print a[i]
	 * then use IF condition if clements not found
	 * 
	 */
	
	public static void main(String[] args) {
		
		String str[]= {"java","C++","Net","Selenium","Selenium"};
		
		
		boolean flag=false;
		for(int i=0;i<str.length;i++) {
			
			for(int j=i+1;j<str.length;j++) {
				
				if (str[i]==str[j]) {
					
					System.out.println("Duplicated Strings :"+str[i]);
					flag=true;
				}
			}
		}
		if(flag=false) {
			System.out.println("Duplicate Strings not FOUND");
		}
		
	}
		}

