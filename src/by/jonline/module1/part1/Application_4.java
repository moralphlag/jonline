package by.jonline.module1.part1;

/**
 * 
 * Дана действительное число R вида nnn.ddd. Поменять местами дробную и целую части числа и 
 * вывести полученное значение числа.
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
