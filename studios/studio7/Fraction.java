package studio7;

/**
 * @author joshgilberstadt
 *
 */
public class Fraction {
	//fraction has-a
	private final int numerator, denominator, numadd, denadd;
	/**
	 * numerator
	 * denominator
	 */
	public Fraction(int r, int s, int t, int u) {
	this.numerator = r;
	this.denominator = s;
	this.numadd = t;
	this.denadd = u;
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
	return (numerator * denadd + denominator * numadd) + " / " + denominator * denadd;
	}
	/**
	 * multiplication
	 * 
	 */
	public String multiply() {
	return numerator * numadd + " / " + denominator * denadd;
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
	Fraction f = new Fraction (12, 48, 4, 7);
	System.out.println("How do we know that our fraction is a fraction? " + f);
	}

}
