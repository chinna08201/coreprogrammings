package UiWebMSys;

public class MatrixMinColumnNumber {
	
	public static void main(String[] args) {
		
		
		int a[][]= {{3,2,5},{4,7,6},{9,6,8}};
		
		int min=a[0][0];
		int minColumn=0;
		
		
		
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j <3; j++) {
				
				if(a[i][j]<min) {
					
					min=a[i][j];
					minColumn=j;
					
				}
				
				
				
			}
			
			
		}
		
	}

}
