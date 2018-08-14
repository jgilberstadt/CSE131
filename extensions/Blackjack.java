import cse131.ArgsProcessor;

public class Blackjack {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int p = ap.nextInt("Number of autonomous players?");
		int games = ap.nextInt("Number of games played?");
		System.out.println("You chose to play " + games + " games");
		System.out.println("There are " + p + " automonous players playing.");
		System.out.println();
		int[] score = new int [p + 2];
	for (int k = 1; k <= games; k++) {
		for (int i = 0; i < p + 2; i++) {
			int card1 = (int) (13 * Math.random());
			if (card1 == 0) {
			score[i] = 11;
			}else if ((card1 > 0)&&(card1 < 9)) {
			score[i] = card1 + 1;
			}else {
			score[i] = 10;
			}
			}
			for (int j = 0; j < p + 1; j++) {
			int card2 = (int) (13 * Math.random());
			if (card2 == 0) {
			score[j] = score[j] + 11;
			}else if ((card2 > 0)&&(card2 < 9)) {
			score[j] = score[j] + card2 + 1;
			}else {
			score[j] = score[j] + 10;
			}
		}
		System.out.println("Game " + k);
		System.out.println("The dealer's face-up card has the value of " + score[p + 1]);
		System.out.println("The players' scores are:");
		for (int l = 1; l < p + 1; l++) {
		System.out.print(score[l] + " ");	
		}
		System.out.println();
		System.out.println("The Dealer's face-up care has the value of " + score[p + 1] + ". And your current account is " + score[0]);
		int move = ap.nextInt("Press 1 to hit or 0 to stand");
		if (move == 0) {
		System.out.println("You chose to stand!");
		System.out.println();
		} 
		while ((move == 1)&&(score[0] < 22)) {
		System.out.println("You hit!");
		int card3 = (int) (13 * Math.random());
		if (card3 == 0) {
			score[0] = score[0] + 11;
			}else if ((card3 > 0)&&(card3 < 9)) {
			score[0] = score[0] + card3 + 1;
			}else {
			score[0] = score[0] + 10;
			}
	}
	}
}
}