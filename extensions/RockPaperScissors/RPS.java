package RockPaperScissors;

public class RPS {
	public static void main(String[] args) {
int n;
int i = 0;
int j = 0;
int b = 0;
for (n = 0; n < 1000; n++) {
int a = (int) ((3 * Math.random()) + 1);
b = (b % 3) + 1;
if (a > b) {
i = i + 1;
}else if (b > a) {
j = j + 1;	
}
}
System.out.println("The random player won " + i + " times out of 1000, the faithfully rotating player won " + j + " times out of 100 and there were " + (1000 - i - j) + " ties.");
}
}