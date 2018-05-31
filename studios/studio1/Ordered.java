package studio1;

import cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Enter 5");
		int y = ap.nextInt("Enter 4");
		int z = ap.nextInt("Enter 3");
boolean isOrdered= ((x > y) && (y > z)) || ((x < y) && (y < z));
		System.out.println(isOrdered);

	}

}
