package studio7;

/**
 * @author joshgilberstadt
 *
 */
public class Fraction {
	//fraction has-a
	private final int numerator, denominator;
	/**
	 * numerator
	 * denominator
	 */
	public Fraction(int r, int s) {
	this.numerator = r;
	this.denominator = s;
	}
	/**
	 * fraction
	 */
	public String fraction() {
	return numerator + " / " + denominator;
	}
	/**
	 * addition
	 * 
	 */
	public String add() {
	return numerator + " / " + denominator + " + a / b = (" + numerator + "b + " + denominator + "a) / " + denominator + "b";
	}
	/**
	 * multiplication
	 * 
	 */
	public String multiply() {
	return numerator + " / " + denominator + " * a / b = " + numerator + "a / " + denominator + "b";
	}
	/**
	 * reciprocal
	 * 
	 */
	public String reciprocal() {
	return denominator + " / " + numerator;
	}
	/**
	 * simplification
	 * 
	 */
	public String simplify(int j, int k) {
	for (int i = 1; i <= numerator; i++) {
	if ((numerator % i == 0) && (denominator % i == 0)) {
	j = numerator;
	k = denominator;
	j = j / i;
	k = k / i;
	}
	}
	return j + " / " + k;
	}
	
	public String toString() {
	return 	"Fraction: " + fraction() + ". Addition: " + add() + ". Multiplication: " + multiply() + ". Reciprocal: " + reciprocal() + ". Simplified fraction: " + simplify(numerator, denominator) + ".";
	}
	
	public static void main(String[] args) {
	Fraction f = new Fraction (12, 48);
	System.out.println("How do we know that out fraction is a fraction? " + f);
	}

}
