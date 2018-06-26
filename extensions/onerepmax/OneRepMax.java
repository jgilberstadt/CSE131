package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double successBench = ap.nextInt("Successful weight benched?");
		double successReps = ap.nextInt("Number of successful reps?");
		double desiredReps = ap.nextInt("Number of desired reps?");
		if ((successReps > 12) || (successReps < 2) || (desiredReps > 12) || (desiredReps < 2) || (successBench <= 0)) {
System.out.println("The given data cannot be computed");
	System.exit(0);
		}else {
	double success = (double) 1 + (successReps / 30);
	double desired = (double) 1 + (desiredReps / 30);
			int repMax = (int) (successBench * success);
	int weightForReps = (int) (5 * ((repMax / desired) / 5)); 
	System.out.println("One-rep max: " +  5 * (repMax / 5));
	System.out.println("Weight for " + Math.round(desiredReps) + " reps: " + 5 * (weightForReps / 5));
	int i;
	for (i = 1; i <= 10; i++) {
	int percentLift = (repMax * (100 - (5 * i)) / 100);
	System.out.println(100 - (5 * i) + "% 1 RM: " + 5 * (percentLift / 5));
	}
}
}
}