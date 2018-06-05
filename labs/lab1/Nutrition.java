package lab1;

import cse131.ArgsProcessor;

public class Nutrition {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Name of food?");
		String s1 = ap.nextString("Grams of carbohydrates?");
		String s2 = ap.nextString("Grams of fat?");
		String s3 = ap.nextString("Grams of protein?");
		String s4 = ap.nextString("Number of calories stated on label?");
		String t1 = String.valueOf(Float.valueOf(s1) * 4);
		String t2 = String.valueOf(Float.valueOf(s2) * 9);
		String t3 = String.valueOf(Float.valueOf(s3) * 4);
		String t4 = String.valueOf(Float.valueOf(s4) - Float.valueOf(t1) - Float.valueOf(t2) - Float.valueOf(t3));
		String t5 = String.valueOf(Float.valueOf(t4) / 4);
		double a = (double) (Float.valueOf(t1) * 100 / (Float.valueOf(t1) + Float.valueOf(t2) + Float.valueOf(t3)));
		double roundOff1 = (double) Math.round (a * 10) / 10;
		System.out.println(s0 + " has ");
		System.out.println(s1 + " grams of carbohydrates " + "= " + t1 + " Calories");
		System.out.println(s2 + " grams of fat " + "= " + t2 + " Calories");
		System.out.println(s3 + " grams of protein " + "= " + t3 + " Calories");
		System.out.println();
		System.out.println("This food is said to have " + s4 + " (available) Calories.");
		System.out.println("With " + t4 + " unavaliable Calories, this food has " + t5 + " grams of fiber");
		System.out.println();
		System.out.println("Approximately");
		System.out.println("  " + roundOff1 + " % of your food is carbohydrates");
		double b = (double) (Float.valueOf(t2) * 100 / (Float.valueOf(t1) + Float.valueOf(t2) + Float.valueOf(t3)));
		double roundOff2 = (double) Math.round (b * 10) / 10;
		System.out.println("  " + roundOff2 + " % of your food is fat");
		double c = (double) (Float.valueOf(t3) * 100 / (Float.valueOf(t1) + Float.valueOf(t2) + Float.valueOf(t3)));
		double roundOff3 = (double) Math.round(c * 10) / 10;
		System.out.println("  " + roundOff3 + " % of your food is protein");
		System.out.println();
		boolean isOrdered1 = a <= 25.0;
		System.out.println("This food is acceptable for a low-carb diet?  " + isOrdered1);
		boolean isOrdered2 = b <= 15.0;
		System.out.println("This food is acceptable for a low-fat diet?  " + isOrdered2);
		int randomNumber = (int) (1 + Math.random() * 2);
        boolean isOrdered3 = randomNumber > 1.5;
		System.out.println("By coin flip, you should eat this food?   " + isOrdered3);
	 

		
		
		
		
		
		
	}
	}
