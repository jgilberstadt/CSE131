package arrays;
import cse131.ArgsProcessor;

public class Birthday {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int people = ap.nextInt("Number of people in room?");
		int[][] birthday = new int[12][31];
		int p;
		int o = 0;
		int[] month = new int[12];
		int[] day = new int[31];
		for (p = 0; p < people; p++) {
		int m = (int) (Math.random() * 12);
		int d = (int) (Math.random() * 31);
		birthday[m][d] = birthday [m][d] + 1;
		month[m] = month[m] + 1;
		day[d] = day[d] + 1;
		}
		int x;
		int y;
		for (x = 0; x < 12; x++) {
		for (y = 0; y < 31; y++) {
		if (birthday[x][y] > 1) {
		o = o + (birthday[x][y]);
		}
		}
		}
		System.out.println("% of people born in January: " + (100 * month[0] / people) + "%");
		System.out.println("% of people born in February: " + (100 * month[1] / people) + "%");
		System.out.println("% of people born in March: " + (100 * month[2] / people) + "%");
		System.out.println("% of people born in April: " + (100 * month[3] / people) + "%");
		System.out.println("% of people born in May: " + (100 * month[4] / people) + "%");
		System.out.println("% of people born in June: " + (100 * month[5] / people) + "%");
		System.out.println("% of people born in July: " + (100 * month[6] / people) + "%");
		System.out.println("% of people born in August: " + (100 * month[7] / people) + "%");
		System.out.println("% of people born in September: " + (100 * month[8] / people) + "%");
		System.out.println("% of people born in October: " + (100 * month[9] / people) + "%");
		System.out.println("% of people born in November: " + (100 * month[10] / people) + "%");
		System.out.println("% of people born in December: " + (100 * month[11] / people) + "%");
		System.out.println("Average % of people born per month: " + ((month[0] + month[1] + month[2] + month[3] + month[4] + month[5] + month[6] + month[7] + month[8] + month[9] + month[10] + month[11]) / 12) + "%");
		int a;
		int b;
		int k = 0;
		for (b = 0; b < 31; b++) {
		System.out.println("% of people born on day " + (b + 1) + " of the month: " + (100 * day[b] / people) + "%");
		k = k + day[b];
		}
		System.out.println("Average % of people born per day: " + (100 * k / 31) + "%");
	System.out.println("% of people who were born on exactly the same day: " + (100 * o / people) + "%");
	}
}

