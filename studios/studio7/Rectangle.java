package studio7;

/**
 * @author joshgilberstadt
 *
 */
public class Rectangle {
	// rectangle has-a
	private final int x1, x2, y1, y2, x3, x4, y3, y4;
	/***
	 * rectangle coordinates
	 *
	 */
	public Rectangle(int x1, int x2, int y1, int y2, int x3, int x4, int y3, int y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.x3 = x3;
		this.x4 = x4;
		this.y3 = y3;
		this.y4 = y4;
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

	public String areaComparison() {
		if ((Math.abs(x1 - x2) * Math.abs(y1 - y2)) < (Math.abs(x3 - x4) * Math.abs(y3 - y4))){
		return "Rectangle 1 has a smaller area than rectangle 2";
		}
		if ((Math.abs(x1 - x2) * Math.abs(y1 - y2)) == (Math.abs(x3 - x4) * Math.abs(y3 - y4))){
		return "Rectangle 1 has the same area as rectangle 2";
		}else {
		return "Rectangle 1 has a greater area than rectangle 2";
		}
	}
	
	public String square() {
	if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
	return "Rectangle is square";	
	}else {
	return "Rectangle is not square";
	}
	}
	
	public String toString() {
		return "Perimeter = " + getPerimeter() + ", area = " + getArea() + ". " + areaComparison() + ". " + square() + ".";
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 6, 4, 9, 2, 8, 4, 9);
		System.out.println("Perimeter and area of rectangle? " + rec);
	}

}
