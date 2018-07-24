package instrument;

public class BankInterestCalculator {

	public static void main(String[] args) {
		System.out.println("Day    Type         Amount       Balance");
double s = 4000.00;
		double r;
for (int i = 1; i <= 30; i++) {
	r = Math.random();
			if (r < 0.5) {
				s = s - 100.00;
			}else {
				s = s + 200.50;
			}
	if (i < 10) {		
System.out.print(i + "      ");
	}else {
		System.out.print(i + "     ");
	}
if (r < 0.5) {
	System.out.println("Withdraw     $100.00      $" + String.format("%.6g%n", s));
}else {
	System.out.println("Deposit      $200.50      $" + String.format("%.6g%n", s));
}
}
System.out.println();
double e = s * (.02);
System.out.println("Interest earned: " + (e * 10000) / 10000);
System.out.println("Money after one month's interest: " + String.format("%.6g%n", s));
}

}
