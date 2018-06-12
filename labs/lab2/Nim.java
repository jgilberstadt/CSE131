package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Type 'Human' if you want to start or 'Computer' if you want the computer to start");
		System.out.println(s0 + " starts");
		int i = 7;
		int j = 0;
		while (i > 0){
		if (s0.equals("Human")){
		int n = ap.nextInt("There are " + i + " sticks remaining. You may remove either 1 or 2 sticks. Type '1' to remove 1 or '2' to remove 2.");
		i = i - n;
		int k = i + n;
		System.out.println("Round " + j + ", " + k + " sticks at start, human took " + n + ", so " + i + " sticks remain");
		if (i == 0){
		System.out.println("Human wins");
		System.exit(0);
		}
		j = j + 1;
		n = (int) (Math.random() * 2 + 1);
		i = i - n;
		k = i + n;
		System.out.println("Round " + j + ", " + k + " sticks at start, computer took " + n + ", so " + i + " sticks remain");
		if (i == 0) {
		System.out.println("Computer wins");	
		System.exit(0);
		}
		j = j + 1;
		}else{
		int n = (int) (Math.random() * 2 + 1);
		i = i - n;
		int k = i + n;
		System.out.println("Round " + j + ", " + k + " sticks at start, computer took " + n + ", so " + i + " sticks remain");
		if (i == 0) {
		System.out.println("Computer wins");	
		System.exit(0);
		}
		j = j + 1;
		n = ap.nextInt("There are " + i + " sticks remaining. You may remove either 1 or 2 sticks. Type '1' to remove 1 or '2' to remove 2.");
		i = i - n;
		k = i + n;
		System.out.println("Round " + j + ", " + k + " sticks at start, human took " + n + ", so " + i + " sticks remain");
		if (i == 0){
		System.out.println("Human wins");
		System.exit(0);
		}
		j = j + 1;
		}
		}
	
	}

}
