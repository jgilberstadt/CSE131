package lab4;

import cse131.ArgsProcessor;

import java.awt.Color;

import java.awt.font.*;

import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
			ArgsProcessor ap = new ArgsProcessor(args);
	int balls = ap.nextInt("Number of balls from 1 to 10?");
	if ((balls >= 1) && (balls <= 10)) {
		StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        double[] velocityx = new double[balls];
        double[] velocityy = new double[balls];
        double[] positionx = new double[balls];
        double[] positiony = new double[balls];
        int b;
        for (b = 0; b < balls; b++) {
			double velx = (Math.random() * .008) + .015;
	velocityx[b] = velx;
        }
        int e;
        for (e = 0; e < balls; e++) {
			double vely = (Math.random() * .008) + .015;
	velocityy[e] = vely;
        }
        double radius = 0.05;
       int a;
        for (a = 0; a < balls; a++) {
          double posx = (Math.random() * .9) + .05;
            positionx[a] = posx;
             }
        int d;
        for (d = 0; d < balls; d++) {
          double posy = (Math.random() * .9) + .05;
            positiony[d] = posy;
             }
        while (true)  {
            int f;
        	for (f = 0; f < balls; f++) {
        	if (Math.abs(positionx[f] + velocityx[f]) > 1.0 - radius) { 
        		velocityx[f] = -1 * velocityx[f];
        	}
            if (Math.abs(positiony[f] + velocityy[f]) > 1.0 - radius){ 
            	velocityy[f] = -1 * velocityy[f];
            }
            positionx[f] = positionx[f] + velocityx[f]; 
            positiony[f] = positiony[f] + velocityy[f]; 
        	}
        	int g;
        	int h;
        	for (g = 0; g <= balls - 2; g++) {
        	for (h = g + 1; h <= balls - 1; h++) {
        	if (Math.sqrt(Math.abs(Math.pow(positionx[g] + velocityx[g]- positionx[h] - velocityx[h], 2) + Math.pow(positiony[g] + velocityy[g]- positiony[h] - velocityy[h], 2))) < 2 * radius) {
        	velocityx[g] = -1 * velocityx[g];
        	velocityy[g] = -1 * velocityy[g];
        	velocityx[h] = -1 * velocityx[h];
        	velocityy[h] = -1 * velocityy[h];
        	}
        	}	
        }
            StdDraw.clear(StdDraw.LIGHT_GRAY);
            StdDraw.setPenColor(StdDraw.BLACK); 
            int c;
            for (c = 0; c < balls; c++) {
            StdDraw.filledCircle(positionx[c], positiony[c], radius); 
        	StdDraw.show();
            }
            StdDraw.pause(20);
	}
	}
}
}