import java.util.Arrays;

public class String {

	public static void main(java.lang.String[] args) {
	java.lang.String s = "25 - 74";
	int n = 0;
	int r = 0;
	int z = 0;
	int t = 0;
	int u = 0;
	for(int i = 0; i < s.length(); i++) {
	if (!Character.isDigit(s.charAt(i))) {
	if (n == 0) {
	r = i;
	}
	n = n + 1;
	}
	}
	for (int q = r + n; q < s.length(); q++) {
	z = z + 1;
	}
	char[] num1 = new char[r];
	char[] space = new char[n];
	char[] num2 = new char[z];
	for (int a = 0; a < r; a++) {
	t = (int) (t + (Math.pow(10, r - a - 1) * Integer.parseInt(Character.toString(s.charAt(a)))));
	num1[a] = s.charAt(a);
	}
	for (int b = r; b < r + n; b++) {
	space[b - r] = s.charAt(b);
	}
	for (int c = r + n; c < s.length(); c++) {
	num2[c - r - n] = s.charAt(c);
	u = (int) (u + Math.pow(10, s.length() - c - 1) * Integer.parseInt(Character.toString(s.charAt(c))));
	}
	java.lang.String a = Arrays.toString(num1);
	java.lang.String b = Arrays.toString(space);
	java.lang.String c = Arrays.toString(num2);
	java.lang.String f = "+-*/";
	if (space[1] == f.charAt(0)) {
		System.out.println(t + " + " + u + " = " + (t + u));
		}else if (space[1] == f.charAt(1)) {
		System.out.println(t + " - " + u + " = " + (t - u)) ;
		}else if (b.charAt(1) == f.charAt(2)) {
		System.out.println(a + b + c + " = " + (Integer.parseInt(a) * Integer.parseInt(c)));
		}else {
		System.out.println(a + b + c + " = " +  (Double.parseDouble(a) / Double.parseDouble(c)));
		}
		}
	}