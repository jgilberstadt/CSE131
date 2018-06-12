package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Type 'human' if you want to start or 'computer' if you want the computer to start");
		System.out.println(s0 + " starts");
		int i = 7;
		int j = 0;
		while (i > 0){
		if (s0 = human){
		int n = ap.nextInt("There are " + i + "sticks remaining. You may remove either 1 or 2 sticks. Type '1' to remove 1 or '2' to remove 2.");
		i = i - n;
		}else{
		i = i - (int) Math.random() * 2	
			
		}
		}
	}

}
