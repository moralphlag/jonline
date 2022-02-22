package by.jonline.basic.branch;

//����� max{min(a, b), min(c, d)
public class Application_2 {
	public static void main(String[] args) {

		int a = 10;
		int b = 9;
		int c = 13;
		int d = 12;

		int min1, min2, max;

		min1 = (a < b) ? a : b;
		min2 = (c < d) ? c : d;
		max = (min1 < min2) ? min2 : min1;

		System.out.println("The max value is " + max);
	}
}
