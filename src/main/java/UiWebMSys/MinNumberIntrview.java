package UiWebMSys;

public class MinNumberIntrview {

	
	public static void main(String[] args) {
		
		int a[][]= {{3,2,5},{4,7,6},{9,6,3}};
		
		
		//start the iteration using FOR loop
		//create one temp Integer variable with value
		
		int min=a[0][0];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				if(a[i][j]<min) {
					
					min=a[i][j];
					
				}
			}
		}
		
		System.out.println(min);
	}
}
