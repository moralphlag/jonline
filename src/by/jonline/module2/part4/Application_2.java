package by.jonline.module2.part4;

public class Application_2 {

	public static void main(String[] args) {
		int a = 78;
		int b = 294;
		int c = 570;
		int d = 36;

		System.out.println("НОД(" + a + ", " + b + ") = " + nod(a, b));
		System.out.println("НОД(" + a + ", " + b + ", " + c + ", " + d + ") = " + nod4(a, b, c, d));
	}

	public static int nod4(int a, int b, int c, int d) {
		return (nod(nod(nod(a, b), c), d));
	}

	public static int nod(int a, int b) {
		if (a <= 0 || b <= 0) {
			return -1;
		} else {
			int val1 = Math.max(a, b);
			int val2 = Math.min(a, b);

			int r = 0;
			do {
				r = val1 % val2;

				val1 = val2;
				val2 = r;

			} while (r != 0);
			return val1;
		}
	}
}
