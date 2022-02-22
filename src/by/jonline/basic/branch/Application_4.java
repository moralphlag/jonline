package by.jonline.basic.branch;

//������ ������� A, B �������������� ��������� � ������� x, y, z �������. 
//����������, ������� �� ������ ���������.
public class Application_4 {
	public static void main(String[] args) {
		int A = 3;
		int B = 3;
		
		int x = 2;
		int y = 3;
		int z = 4;

		if (((A >= x) && (B >= y)) || ((B >= x) && (A >= y))) {
			System.out.println("The brick will fit through the hole.");
		} else if (((A >= y) && (B >= z)) || ((B >= y) && (A >= z))) {
			System.out.println("The brick will fit through the hole.");
		} else if (((A >= z) && (B >= x)) || ((B >= z) && (A >= x))) {
			System.out.println("The brick will fit through the hole.");
		} else {
			System.out.println("The brick won't fit through the hole.");
		}
	}
}
