package studio3;

import cse131.ArgsProcessor;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int arraySize = ap.nextInt("Size of array?");
		if (arraySize > 2) {
		int[] array = new int[arraySize];
		int i;
		int j;
		for (i = 0; i <= (arraySize); i++) {
		array[i] = i;
		for (j = 4; (j <= arraySize); j++) {   
			for (i = 2; i <= j/2; i++){ 
				if (array[j] % i == 0){           
					System.out.println(j + " is not a prime number");
				}
		}
		}
		}
		}
		}
		}
		
