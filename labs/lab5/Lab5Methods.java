package lab5;

public class Lab5Methods {
public static int sumDownBy2(int n) {
	int r = n;
	if (n > 1) {
	for (int i = 1; 2 * i < n; i++) {
r = r + (n - (2 * i));
	}
	return r;
}else if (n == 1){
	return 1;
}else {
	return 0;
}
}
public static double harmonicSum(int n) {
	double r = 0;
	for (int l = 1; l <= n; l++) {
	r = r  + 1.0/l;
	}
	return r;	
}
public static double geometricSum(int k) {
double r = 0;
	if (k > 0) {
for (int i = 0; i <= k; i++)	{
	r = r + 1/(Math.pow(2, i));
}
return r;
}else {
	return 1;
}
}
public static int multPos(int j, int k) {
	int r = 0;
	if ((j > 0) && (k > 0)) {
	for (int i = 0; i < j; i++) {
	r = r + k;
	}
		return r;
	}else {
		return 0;
	}
}
public static int expt(int n, int k) {
	int r = 1;
	if (k > 0) {
	for (int i = 1; i <=k; i++) {
	r = r * n;
	}
	return r;
}else {
	return 1;
}
}
public static int mult(int j, int k) {
	if (((j > 0) && (k > 0)) || ((j < 0) && (k < 0))) {
	return multPos(Math.abs(j), Math.abs(k));
	}else{
	return -1 *	multPos(Math.abs(j), Math.abs(k));
	}
}
}