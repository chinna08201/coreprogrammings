package UiWebMSys;

import java.util.ArrayList;

public class UniqNumOccurance {

	public void printUniqueNumberOccuring() {

		int[] a = { 4, 3, 4, 5, 4, 5, 5, 2, 7, 8, 8, 9 };
		// 4 -3,3 -1,5-3, 2-1,7-1,8-2,9-1

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int temp = 0;
			if (!al.contains(a[i])) {

				al.add(a[i]);
				temp++;

				for (int k = i + 1; k < a.length; k++) {

					if (a[i] == a[k]) {
						temp++;
					}

				}
				System.out.println(a[i]);
				System.out.println(temp);
			}
			
		}

	}

	public static void main(String[] args) {
		new UniqNumOccurance().printUniqueNumberOccuring();
	}
}
