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
        double rx = 0.480, ry = 0.860;
        int b;
        for (b = 0; b < balls; b++) {
	double[] velocityx = new double[balls];
			double velx = (Math.random() * .008) + .015;
	velocityx[b] = velx;
        }
        int e;
        for (e = 0; e < balls; e++) {
	double[] velocityy = new double[balls];
			double vely = (Math.random() * .008) + .015;
	velocityy[e] = vely;
        }
        double vx = 0.015, vy = 0.023;
        double radius = 0.05;
       int a;
        for (a = 0; a < balls; a++) {
            double[] positionx = new double[balls];
          double posx = (Math.random() * .9) + .05;
            positionx[a] = posx;
             }
        int d;
        for (d = 0; d < balls; d++) {
            double[] positiony = new double[balls];
          double posy = (Math.random() * .9) + .05;
            positiony[d] = posy;
             }
        while (true)  { 
        	if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
            rx = rx + vx; 
            ry = ry + vy; 
            StdDraw.clear(StdDraw.LIGHT_GRAY);
            StdDraw.setPenColor(StdDraw.BLACK); 
            int c;
            for (c = 0; c < balls; c++) {
            StdDraw.filledCircle(positionx[c], positiony[c], radius); 
            }
        	StdDraw.show();
            StdDraw.pause(20);
	}
	}
}
}