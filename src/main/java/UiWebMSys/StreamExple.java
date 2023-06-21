package UiWebMSys;

import java.util.ArrayList;

public class StreamExple {

	public static void main(String[] args) {

		ArrayList<String> values = new ArrayList<String>();
		values.add("Anil");
		values.add("Alshaya");
		values.add("Akash");
		values.add("AnAbhayil");
		values.add("Kaju");
		values.add("MahasriChandana");
		
		
		long valu=values.stream().filter(s->s.startsWith("A")).count();
		System.out.println(valu);

	}

}
