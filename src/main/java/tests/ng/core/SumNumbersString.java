package tests.ng.core;

public class SumNumbersString {
	
	
	public static  void  Summ(String str) {
		
		int sum=0;
	String s1=	str.replaceAll("[^0-9]", "");
	String[] val=s1.split("");
	
	for(int i=0;i<val.length;i++) {
		if(!val[i].isEmpty()) {
			sum+=Integer.parseInt(val[i]);
		}
		
	}
	System.out.println(sum);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Summ("abc123xyz");
		
		

	}

}
