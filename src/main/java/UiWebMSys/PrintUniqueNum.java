package UiWebMSys;

public class PrintUniqueNum {
	
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,4,2,5,1,7,7,9,8};
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					count++;
				}
			}
		}
		
		System.out.println("Duplicate count"+count);
		
		
	}

}
