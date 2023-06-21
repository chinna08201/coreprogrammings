package UiWebMSys;

public class PrintDiamond {
	
	public static void main(String[] args) {
		
		
		int rows =7;
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
				
	}

}
