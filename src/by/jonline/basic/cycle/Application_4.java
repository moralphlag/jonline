package by.jonline.basic.cycle;

//��������� ��������� ���������� ������������ ��������� ������ ������� �����.
public class Application_4 {
	public static void main(String[] args) {
		long multi = 1;
		for (int i = 1; i <= 200; ++i) {
			multi *= Math.pow(i, 2);
		}
		System.out.println("the multiplication of the squares of the first two hundred numbers is " + multi);
	}
}
