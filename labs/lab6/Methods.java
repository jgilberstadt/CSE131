package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int xf = 99;
		int x = 2;
		int y = 3;
		//
		// from here, call f or g with the appropriate parameters
		//
		f(xf);
		g(x, y);
	System.out.println(g(x, y));
	}

	private static int g(int x, int y) {
		if (x == 0) 
	return y + 1;
	if ((x > 0)&&(x == y)) 
		return g(x - 1, 1);
	if ((x > 0)&&(y > 0)) 
		return g(x - 1, g(x, y - 1));
	else
		return 0;
	}
	

	private static void g(int x, Object g) {
		// TODO Auto-generated method stub
		
	}

	private static void f(int xf) {
		if (xf > 100) 
		System.out.println(xf - 10);
	
	if (xf <= 100)
		f(xf + 11);
	}

}
