package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numberOfDice = ap.nextInt("Number of dice?");
		int timesThrown = ap.nextInt("Number of times dice are thrown?");
		int i;
		int j;
	if ((numberOfDice > 0) && (timesThrown > 0)) {
	for (i = 0; i < (timesThrown); i++) {
	int[] dice = new int[numberOfDice];
	for (j = 0; j < (numberOfDice); j++ ) {
		dice[j] = (int) (6 * Math.random() + 1);
	}
		for (int temp : dice) {
	System.out.println(temp);
}
}
}
}
}