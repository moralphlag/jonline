package by.jonline.basic.linear_program;

/**
 * 
 * ���� �������������� ����� R ���� nnn.ddd. �������� ������� ������� � ����� ����� ����� � 
 * ������� ���������� �������� �����.
 * 
 **/
public class Application_4 {
	public static void main(String[] args) {
		double z = 333.666;

        int nnn = (int) z;
        int ddd = ((int)(z * 1000 - nnn * 1000));
        z = ddd + nnn / 1000.0;
        System.out.println("z = " + z);
	}
}
