import java.util.Arrays;

public class String {

	public static void main(java.lang.String[] args) {
	java.lang.String s = "25 * 74";
	int n = 0;
	int r = 0;
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
	for (int a = 0; a < r; a++) {
	t = (int) (t + (Math.pow(10, r - a - 1) * Integer.parseInt(Character.toString(s.charAt(a)))));
	}
	for (int c = r + n; c < s.length(); c++) {
	u = (int) (u + Math.pow(10, s.length() - c - 1) * Integer.parseInt(Character.toString(s.charAt(c))));
	}
	java.lang.String f = "+-*/";
	if (s.charAt(r + 1) == f.charAt(0)) {
		System.out.println(t + " + " + u + " = " + (t + u));
		}else if (s.charAt(r + 1) == f.charAt(1)) {
		System.out.println(t + " - " + u + " = " + (t - u)) ;
		}else if (s.charAt(r + 1) == f.charAt(2)) {
		System.out.println(t + " * " + u + " = " + (t * u));
		}else {
		System.out.println(t + " / " + u + " = " + (double) t / (double) u);;
		}
		}
	}