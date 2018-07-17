package lab6;

public class Beer {

	public static void main(String[] args) {
		int n = 5;
		bottlesOfBeer(n);
	}

	private static void bottlesOfBeer(int n) {
		if (n==0)
			return;
		
		System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer; you take one down, pass it around, " + (n - 1) + " bottles of beer on the wall.");
		bottlesOfBeer(n - 1);
		
	}

}
