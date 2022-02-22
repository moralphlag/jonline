package by.jonline.basic.cycle;

import java.util.Scanner;

//��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����.
public class Application_7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("put m and n:");

		int m = in.nextInt();
		int n = in.nextInt();

		if (m <= 0 || n <= 0) {
			System.out.println("given values is lower than zero");
		} else {
			if (m > n) {
				int temp = m;
				m = n;
				n = temp;
			}
			for (int i = m; i < n; i++) {
				for (int j = m; j < i; j++) {
					if (j == 1) {
						continue;
					}
					if (i % j == 0) {
						System.out.println("The divisor of a number " + i + ": " + j);
					}
				}
			}
		}
	}

}
