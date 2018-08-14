package eyeballs;

import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Eyeballs {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.picture(0.5, 0.5, "images/ken.jpg");
		int N = ap.nextInt("How many eyeballs?");
		int i = N;
		double[][] eyecenters = new double[N][2];
		double[][] erase = new double [N][2];
		while (N == i) {
		while (!StdDraw.mousePressed()) {
		StdDraw.show(50);
		}
		while (StdDraw.mousePressed()) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.03);
			eyecenters[i - N][0] = StdDraw.mouseX();
			eyecenters[i - N][1] = StdDraw.mouseY();
			N = N - 1;
		}
		}
		while ((N != i)&&(N != 0)){
		while (!StdDraw.mousePressed()) {
			for (int j = 0; j < i - N; j++) {
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(eyecenters[j][0], eyecenters[j][1], 0.03);
				StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(eyecenters[j][0] + 0.0225 * (StdDraw.mouseX() - eyecenters[j][0]) / Math.sqrt(Math.pow(StdDraw.mouseX() - eyecenters[j][0], 2) + Math.pow(StdDraw.mouseY() - eyecenters[j][1], 2)), eyecenters[j][1] + 0.0225 * (StdDraw.mouseY() - eyecenters[j][1]) / Math.sqrt(Math.pow(StdDraw.mouseX() - eyecenters[j][0], 2) + Math.pow(StdDraw.mouseY() - eyecenters[j][1], 2)), 0.0075);	
			}
			StdDraw.show(50);
		}
		while (StdDraw.mousePressed())
		eyecenters[i - N][0] = StdDraw.mouseX();
		eyecenters[i - N][1] = StdDraw.mouseY();
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.03);
		N = N - 1;
		}
		while(N == 0) {
			while ((!StdDraw.mousePressed())||(!StdDraw.mousePressed())) {
				for (int j = 0; j < i - N; j++) {
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.filledCircle(eyecenters[j][0], eyecenters[j][1], 0.03);
					StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledCircle(eyecenters[j][0] + 0.0225 * (StdDraw.mouseX() - eyecenters[j][0]) / Math.sqrt(Math.pow(StdDraw.mouseX() - eyecenters[j][0], 2) + Math.pow(StdDraw.mouseY() - eyecenters[j][1], 2)), eyecenters[j][1] + 0.0225 * (StdDraw.mouseY() - eyecenters[j][1]) / Math.sqrt(Math.pow(StdDraw.mouseX() - eyecenters[j][0], 2) + Math.pow(StdDraw.mouseY() - eyecenters[j][1], 2)), 0.0075);	
				}
				StdDraw.show(50);
			}
		}
}
}
