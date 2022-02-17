package by.jonline.module1.part3;

//Даны числовой ряд и число е. Найти сумму тех членов ряда, модуль которых больше или равен
// заданному е.
public class Application_5 {
	public static void main(String[] args) {

		int a = 0;
		int b = 10;
		double epsilon = 0.005;

		double sum = 0;
		double current_value = 0;
		for (int i = a; i <= b; i++) {
			current_value = Math.abs((1 / Math.pow(2, i) + (1 / Math.pow(3, i))));
			if (current_value >= epsilon) {
				sum += current_value;
			}
		}
		System.out.println("The sum is " + sum);
	}
}
