package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
String name = ap.nextString("Name of apartment complex?");
String zip = ap.nextString("Zip code?");
	int rent = ap.nextInt("Monthly rent? (dollars)");
	double payment = ap.nextInt("Daily interest payment?");
	System.out.println(name + " is located in the Zip Code " + zip);
	System.out.println("Rent per year: $" + 12 * rent);
	System.out.println("Rent per week: $" + rent);
	System.out.println();
	System.out.println("Interest paid per year: $" + (365 * payment) + "0");
	System.out.println("Interest paid per week: $" + (7 * payment) + "0");
	if (rent <= 7 * payment) {
	System.out.println("I should own");
	}else {
		System.out.println("I should rent");
	}
	if (980 <= 7 * payment) {
		System.out.println("If rent increases to $980 per month, I should stay");
	}else {
		System.out.println("If rent increases to $980 per month, I should move");
	}
	}

}
