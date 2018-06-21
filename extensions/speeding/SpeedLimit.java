package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int carSpeed = ap.nextInt("Speed of car in MPH?");
		int speedLimit = ap.nextInt("Speed limit in MPH?");
		int over = carSpeed - speedLimit;
		int fine = (carSpeed >= (speedLimit + 10)) ? (50 + 10 * (carSpeed - (speedLimit + 10))) : 0;
		System.out.println("You reported a speed of " + carSpeed + " MPH for a speed limit of " + speedLimit + " MPH.");
		System.out.println("You went " + over + " MPH over the speed limit. Your fine is $" + fine + ".");
		

	}

}
