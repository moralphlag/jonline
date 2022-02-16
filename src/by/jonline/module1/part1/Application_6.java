package by.jonline.module1.part1;

/* Для данной области составить линейную программу, которая печатает true, если точка 
 * с координатами (х, у) принадлежит закрашенной области , и false в противном случае */
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
