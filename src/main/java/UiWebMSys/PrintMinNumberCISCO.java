package UiWebMSys;

public class PrintMinNumberCISCO {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 *  6 7 5
		 *  
		 *  4 3 8
		 *  
		 *  8 4 9
		 */
		
		int minColumn=0;
		int[][] xy= {{6,7,5},{4,3,8},{8,4,9}};
		int min=xy[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(xy[i][j]<min) {
					min=xy[i][j];
					minColumn=j;
				}
				
			}
		}
		
		int k=0;
		int max=xy[0][minColumn];
		while(k<3) {
			if(xy[k][minColumn]>max) {
				max=xy[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
