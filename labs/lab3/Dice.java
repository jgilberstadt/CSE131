package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numberOfDice = ap.nextInt("Number of dice?");
		int timesThrown = ap.nextInt("Number of times dice are thrown?");
		System.out.println(numberOfDice);
		System.out.println(timesThrown);
	}
	

}
