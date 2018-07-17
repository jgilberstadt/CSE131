package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 56;
		//
		// from here, call f or g with the appropriate parameters
		//
		f(x);
	}

	private static void f(int x) {
		// TODO Auto-generated method stub
		if (x > 100) 
		System.out.println(x - 10);
	
	if (x <= 100)
		f(x + 11);
	}

}
