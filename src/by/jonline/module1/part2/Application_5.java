package by.jonline.module1.part2;

//Вычислить значение фукнции. 
public class Application_5 {
	public static void main(String[] args) {

		double x = 12.7;

		double return_value = 0;
		if (x <= 3) {
			return_value = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("The value of the function is " + return_value);
		} else {
			return_value = 1 / (Math.pow(x, 2) + 6);
			System.out.println("The value of the function is " + return_value);
		}
	}
}
