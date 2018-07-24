package lab3;

import cse131.ArgsProcessor;

public class MineSweeper {

	public static void main (String[] args) {
		
		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//
		String [][] x = new String[rows + 2][cols + 2];
		int [][] store = new int[rows + 2][cols + 2];
		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				double n = Math.random();
				if (n < percent) {
					x[i][j] = "*";
				}
			}
		}
		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				if (x[i][j] == "*") {
					store[i - 1][j - 1] = store[i-1][j-1] + 1;
					store[i][j - 1] = store[i][j-1] + 1;	
					store[i + 1][j - 1] = store[i+1][j-1] + 1;
					store[i - 1][j] = store[i-1][j] + 1;
					store[i + 1][j] = store[i+1][j] + 1;
					store[i - 1][j + 1] = store[i-1][j+1] + 1;
					store[i][j + 1] = store[i][j+1] + 1;
					store[i + 1][j + 1] = store[i+1][j+1] + 1;
				}
			if (x[i][j] != "*") {
				x[i][j] = ".";
			}
			}
		}
	String [][] show = new String[rows + 2][cols + 2];
	for (int i = 1; i < rows - 1; i++) {
		for (int j = 1; j < cols - 1; j++) {
	if (store[i][j] != 0) {
		show[i][j] = Integer.toString(store[i][j]);
	}else {
		show[i][j] = "*";
		}
	}
	}
for (int i = 1; i < rows - 1; i++) {
	for (int j = 1; j < cols - 1; j++)
	System.out.println(show[i][j] + "    " + store[i][j]);
	}
}
}