package lab8;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial {

	final private LinkedList<Double> list;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		//
		// Set the instance variable (list) to be a new linked list of Double type
		//
		this.list = new LinkedList<Double>();   // FIXME
	}
	
	public String toString() {
		return Double.toString(evaluate(7)); // FIXME
	}

	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;  // required by lab spec
	}

	public double evaluate(double x) {
		double sum = 0.0;
		for (int i = this.list.size() - 1; i >= 0; i--) {
			sum = sum * x + list.get(i);
		}
		return sum;  // FIXME
	}
	
	public Polynomial derivative() {
		Polynomial a = new Polynomial();
		for (int i = 1; i < list.size(); i++) {
		a.addTerm(list.get(i) * i);	
			}
		return a;   // FIXME
	}
	
	public Polynomial sum(Polynomial another) {
		Polynomial p = new Polynomial();
		for (int i = 0; i < Math.min(this.list.size(), another.list.size()); i++) {
		p.addTerm(another.list.get(i) + this.list.get(i));
		}
		if (this.list.size() > another.list.size()){
		for (int i = another.list.size(); i < this.list.size(); i++) {
			p.addTerm(this.list.get(i));
		}
		}else {
			for (int i = this.list.size(); i < another.list.size(); i++) {
			p.addTerm(another.list.get(i));
		}
		}
		return p;   // FIXME
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}

}
