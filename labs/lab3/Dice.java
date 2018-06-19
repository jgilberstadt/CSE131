package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numberOfDice = ap.nextInt("Number of dice?");
		int timesThrown = ap.nextInt("Number of times dice are thrown?");
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		int n = 0;
		int o;
		int p = 0;
	if ((numberOfDice > 0) && (timesThrown > 0)) {
	for (i = 0; i < (timesThrown); i++) {
	int[] dice = new int[numberOfDice];
	for (j = 0; j < (numberOfDice); j++ ) {
		dice[j] = (int) (6 * Math.random() + 1);
	p = p + dice[j];
	}
		for (int temp : dice) {
	System.out.println(temp);
}
	System.out.println("Sum of dice values =" + p);
	p = 0;
	for (k = 0; k < (numberOfDice); k++) {	
	for (l = 0; l < (numberOfDice); l++ ) {
	if ((dice[l] == dice[k])) {
	m = m + 1;
	}
	}
}
	if (m == (numberOfDice * numberOfDice)) {
	n = n + 1;
}
}
	o = 100 * n / (timesThrown);
System.out.println("The dice all showed the same value " + o + "% of the time");
}
}
}