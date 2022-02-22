package by.jonline.basic.linear_program;

/* ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� 
 * � ������������ (�, �) ����������� ����������� ������� , � false � ��������� ������ */
public class Application_6 {
	public static void main(String[] args) {
        double y = 3;
        double x = 3;

        double y_range_top_x_bef_middle = 4;
        double y_range_top_x_aft_middle = 0;
        double y_range_bottom = -3;
        double x_range_lenght_x_bef_middle = 2;
        double x_range_lenght_x_aft_middle = 4;

        boolean ret_val = ((x >= 0 &&x <= x_range_lenght_x_bef_middle)
                && (y >= y_range_bottom && y <= y_range_top_x_bef_middle))
                || ((x >= x_range_lenght_x_bef_middle &&x <= x_range_lenght_x_aft_middle)
                && (y >= y_range_bottom && y <= y_range_top_x_aft_middle));


        System.out.println(ret_val);
	}
}
