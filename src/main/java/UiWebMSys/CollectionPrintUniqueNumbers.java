package UiWebMSys;

import java.util.ArrayList;



public class CollectionPrintUniqueNumbers {
	
	public static void main(String[] args) {
		
		int a[]= {3,2,3,4,7,6,8,8};
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!arrayList1.contains(a[i])) {
				arrayList1.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]+" appared as " +k);
			}
		}
		
		
	}

}
