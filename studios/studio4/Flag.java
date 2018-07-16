package studio4;

import java.awt.Color;

import java.awt.font.*;

import sedgewick.StdAudio;

import sedgewick.StdDraw;

public class Flag {

	
	public static void main(String[] args) {
	StdDraw.setPenColor(StdDraw.RED);
	StdDraw.filledRectangle(.5, .65, .5, .1);
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledRectangle(.5, .45, .5, .1);
	StdDraw.setPenColor(StdDraw.GRAY);
	StdDraw.filledRectangle(.5, .25, .5, .1);
	StdDraw.setPenColor(StdDraw.ORANGE);
	double[] x = {0, 0, .3};
	double[] y = {.75, .15, .45};
	StdDraw.filledPolygon(x, y);
	StdDraw.setPenColor(StdDraw.WHITE);
	StdDraw.filledCircle(.88, .65, .05);
	StdDraw.setPenColor(StdDraw.RED);
	StdDraw.filledEllipse(.93, .65, .07, .05);
	StdDraw.setPenColor(StdDraw.BLUE);
	int i;
	for (i = 0; i < 6; i++) {
	StdDraw.text(.25 + (i * .1), .7 - (.1 * i), "United Gilberstadt Republic");
	}
	int n = 44100;
	double hz = 440.0;
	double[] a = new double[n + 1];
	int j;
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * ((Math.pow(2, 13.0/12.0)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * (Math.pow(2, 13) / (Math.pow(2, 13.0/12.0)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * (Math.pow(2, 13) / (Math.pow(2, 12)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * (Math.pow(2, 13) / (Math.pow(2, 12)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * (Math.pow(2, 13) / (Math.pow(2, 12)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * (Math.pow(2, 13) / (Math.pow(2, 12)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a);
	hz = hz * (Math.pow(2, 13) / (Math.pow(2, 12)));
	for (j = 0; j <= n; j++) {
		a[j] = Math.sin(2 * Math.PI * j * hz / n);
		}
	StdAudio.play(a); 
	}
	}
