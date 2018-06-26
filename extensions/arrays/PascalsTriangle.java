package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int rows = ap.nextInt("Number of rows?");
		int[][] triangle = new int[rows][rows];
		int i;
		for (i = 0; i < rows; i++) {
		triangle[i][i] = 1;
		}
		int j;
		for (j = 0; j < rows; j++) {
		triangle[j][0] = 1;
		}
		int a;
		int b;
		for (b = 2; b < rows; b++) {
		for (a = 1; a <= b - 1; a++) {
		triangle[b][a] = triangle[b - 1][a] + triangle[b - 1][a - 1];
		}
}
		int x;
		int y;
		for (x = 0; x < rows; x++) {
		for (y = 0; y < rows; y++) {
		if (triangle[x][y] != 0) {
		System.out.print(triangle[x][y]);
		}
		}
		System.out.println();	
}
}
}