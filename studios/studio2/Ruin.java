package lab2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String startAmount = ap.nextString("Amount of starting money?");
		String winChance = ap.nextString("Probability of winning a gamble (%)?");
		String winAmount = ap.nextString("Amount of money needed to win?");
		String totalPlays = ap.nextString("Number of times problem is simulated?");
		float lossChance = 100 - Float.valueOf(winChance);
		float Ruin;
		if (lossChance != Float.valueOf(winChance)) 
		{Ruin = ((float)Math.pow((lossChance/Float.valueOf(winChance)), (Float.valueOf(startAmount))) - ((float)Math.pow((lossChance/Float.valueOf(winChance)), (Float.valueOf(winAmount))))) / (1 - (float)Math.pow((lossChance/Float.valueOf(winChance)), (Float.valueOf(winAmount))));} 
		if (lossChance == Float.valueOf(winChance))
		{Ruin = 1 - (Float.valueOf(startAmount) / Float.valueOf(winAmount));}
		int i = 1;
		int j = 1;
		Float k = Float.valueOf(startAmount);
		while (i < Float.valueOf(totalPlays))
		boolean isOrdered1 = Math.random() <= Ruin;
		System.out.println("Simulation " + i + ": " + j );
		boolean isOrdered2 = Math.random() > Ruin;
		k = k + 1; 
		j = j + 1;
		i = i + 1;
		
		