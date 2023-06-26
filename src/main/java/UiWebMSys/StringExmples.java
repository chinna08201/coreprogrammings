package UiWebMSys;

public class StringExmples {
	
	/**
* withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
	 *
	 */
	
	public static void main(String[] args) {
		new StringExmples().stringEremove("Hello there");
		new StringExmples().stringConcat("Hello there");
		
		new StringExmples().stringNotRemove("Hello there");
		
		
		
	}
	
	//withoutString("Hello there", "llo") → "He there"
	public void stringEremove(String str) {
		
		String value=str.replace("llo", "");
		System.out.println(value);
	}
	
	//withoutString("Hello there", "e") → "Hllo thr"
public void stringConcat(String str) {
		
		String value=str.replace("e", "");
		System.out.println(value);
	}

//withoutString("Hello there", "x") → "Hello there"
public void stringNotRemove(String str) {
		
		String value=str.replace("", "");
		System.out.println(value);
	}


}
