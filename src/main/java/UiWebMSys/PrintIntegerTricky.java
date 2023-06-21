package UiWebMSys;

public class PrintIntegerTricky {
	// int -->long-->Integer-->int...
	// The above will be the order

	
	  public void printInt(int i) { System.out.println("int"); }
	 
	
	  public void printInt(Integer i) { System.out.println("Integer"); }
	 
	
	  public void printInt(int... i) { System.out.println("int..."); }
	 
	
	  public void printInt(long i) { System.out.println("long"); }
	 
	public void printInt(short i) {
		System.out.println("short");
	}

	public void printInt(byte i) {
		System.out.println("short");
	}

	public static void main(String[] args) {

		new PrintIntegerTricky().printInt(10);

	}

}
