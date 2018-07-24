package arrays;
import cse131.ArgsProcessor;

public class Sorting {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("Size of collection?");
	while (size <= 0 ) {
		size = ap.nextInt("Size of collection?");
	}
int[] numbers = new int[size];
	for (int i = 0; i < size; i++) {
	numbers[i] = ap.nextInt("Number " + i + " ?");
}
	int sortCount = 0;
	while (sortCount < size) {
	int n = numbers[0];
	for (int j = sortCount; j < size - 1; j++) {
	int s = j;
		n = numbers [j];
		for (int k = sortCount + 1; k < size; k++) {
		if ((numbers[j] > numbers[k]) && (numbers[k] < n)){
		n = numbers[k];
		s = k;
		}
	}
	int p = numbers[j];
	numbers[j] = n;
	numbers[s] = p;
	System.out.println(numbers[j]);
	sortCount = sortCount + 1;
	if (sortCount == size - 1) {
		System.out.print(numbers[j + 1]);
	sortCount = size;
	}
	}
	}
	System.out.println();
	double p= 0;
	for (int i = 0; i < size; i++) {
		p = p + numbers[i];
	}
	p = p / size;
	System.out.println("Mean: " + p);
	System.out.println();
	if ((size % 2) !=0 ) {
	int a = (int) (size/2 - 0.5);
		System.out.println("Median: " + numbers[a]);
	}else {
		int a = ((numbers[size / 2] + numbers[(size / 2) - 1]) / 2);
		System.out.println("Median: " + numbers[a]);
	}
	System.out.println("Min: " + numbers[0]);
	System.out.println();
	System.out.println("Max: " + numbers[size - 1]);
	System.out.println();
	System.out.println("Range: " + (numbers[size - 1] - numbers[0]));
	}
}