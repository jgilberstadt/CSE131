package studio7;

/**
 * @author joshgilberstadt
 *
 */
public class Die {
	// die has-a sides	
	private int sides;
	/**
	 * die has n sides
	 *
	 */
	public Die(int n) {
	this.sides = n;	
	}
	/**
	 * side that die lands on
	 *
	 */
	public int side() {
	return (int) (1 + (Math.random() * sides));	
	}
	
	public String toString() {
	return "The die lands on side " + side();
	}
	
	public static void main(String[] args) {
		Die d = new Die (6);
		System.out.println("Which side does the die land on? " + d);
	}

}
