package by.jonline.module2.part4;

public class Application_1 {

	public static void main(String[] args) {

		System.out.println("Наименьшее общее кратное = " + nok(456, 123));
		System.out.println("Наибольший общий делитель = " + nod(456, 123));
	}

	public static int nok(int a, int b) {
		return (a * b) / nod(a, b);
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
