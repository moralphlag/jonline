package by.jonline.basic.cycle;

//����� ����� ��������� ������ ��� �����
public class Application_3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; ++i) {
			sum += (int) Math.pow(i, 2);
		}
		System.out.println("The sum of the squares of the first hundred numbers is " + sum);

	}
}
