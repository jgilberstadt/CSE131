package instrument;

public class Mario {
	public static void main(String[] args) {

		for (int a = 1; a <= 5; a++) {
			for (int b = 5 - a; b >=1; b--) {
			System.out.print(" ");
		}
			for (int c = 1; c <= a; c++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int x = 1; x <=5; x++) {
			for (int y = 1; y <=x; y++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int n = 5; n >=1; n--) {
			for (int m = 5 - n; m>=1; m--) {
				System.out.print(" ");
			}
			for (int l = 5; l >=6 - n; l--) {
		System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		
	for (int i = 1; i <= 5; i++) {
	for (int j = 5; j >=i; j--) {
	System.out.print("#");
}
System.out.println();
}
}
}
