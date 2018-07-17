package lab6;

import sedgewick.StdDraw;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle(0, 0, 1);
	}
		private static void triangle(double x, double y, double size) {
			StdDraw.setPenColor(StdDraw.BLACK);
		if (size < .05)
			return;
		double[] lx = {x + size / 4, x + size / 2, x + size / 2, x + size * 3 / 4};
		double[] ly = {y + size / 2, y, y, y + size / 2};
		StdDraw.filledPolygon(lx, ly);
		triangle(x, y, size / 2);
		triangle(x + size / 4, y + size / 2, size / 2);
		triangle(x + size / 2, y, size / 2);
		}
		}

