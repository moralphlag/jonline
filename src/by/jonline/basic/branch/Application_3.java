package by.jonline.basic.branch;

//���� ��� ����� A(x1, y2), B(x2, y2), C(x3, y3). ����������, ����� �� ��� ������ �� ����� ������
public class Application_3 {
	public static void main(String[] args) {
		double x1 = 1.1;
		double y1 = 1;
		double x2 = 2;
		double y2 = 2;
		double x3 = 3;
		double y3 = 3;

		if ((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1)) {
			System.out.println("The points lie on the same line.");
		} else {
			System.out.println("The points dont lie on the same line.");
		}
	}
}
