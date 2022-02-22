package by.jonline.basic.linear_program;

/* ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� �
 * ��������. ������� ������ �������� ������������ � ����� , ������� � �������� � ����. �����:
 * ��� ����� SSc */
public class Application_5 {
	public static void main(String[] args) {
        int T = 36666;

        int h = T / 3600;
        int m = (T - (h * 3600)) / 60;
        int s = T - (h * 3600) - (m * 60);

        System.out.println(h + "h" + m + "m" + s + "s");

	}
}
