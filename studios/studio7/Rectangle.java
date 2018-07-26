package studio7;

/**
 * @author joshgilberstadt
 *
 */
public class Rectangle {
	// rectangle has-a
	private final int x1, x2, y1, y2;
	/***
	 * rectangle coordinates
	 *
	 */
	public Rectangle(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	/***
	 * perimeter and area of rectangle
	 *
	 */
	public int getPerimeter() {
		return 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
	}

	public int getArea() {
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}

	public String toString() {
		return "Perimeter = " + getPerimeter() + ", area = " + getArea();
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 6, 4, 9);
		System.out.println("Perimeter and area of rectangle? " + rec);
	}

}
