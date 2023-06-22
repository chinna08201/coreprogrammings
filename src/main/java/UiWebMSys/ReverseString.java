package UiWebMSys;

public class ReverseString {
	
	public void reverseStringBuff(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		
		//Logic 3 using String buffer
		new ReverseString().reverseStringBuff("Alshaya");
		
		
		//Logic 1 using charAt(0, reversing the length
		
		String a="Bangalore City";
		//ytiC erolagnaB
		String rev="";
	
		/*
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
			
		}
		
		System.out.println(rev);
		*/
		
		
		//Logic 2 using toCharArray()
		
char[] s=	a.toCharArray();

for(int i=s.length-1;i>=0;i--) {
	rev+=s[i];
}
System.out.println(rev);
	}

}
