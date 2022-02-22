package by.jonline.basic.cycle;

//������� �� ����� ����������� ����� ��������� � �� ���������� ������������� � ������ ����������
public class Application_6 {
	public static void main(String[] args) {
        char c = 0;
        long top = Character.MAX_CODE_POINT;
        for (long i = 0; i < top; i++)
        {
            c = (char)i;
            System.out.println("The " + i + "th code is " + c);
        }
    }
}
