package by.jonline.module1.part3;

//Даны два числа, определить цифры, входящие в запись как первого так и второго числа.
public class Application_8 {

	public static void main(String[] args) {
		
		int a = 37000412;
		int b = 13571390;
		System.out.println("a = " + a + ", b = " + b);
		int[] number_a = new int[10];
		int[] number_b = new int[10];
		
		while(a != 0) {
			number_a[a % 10]++;
			a /= 10;
		}
		while(b != 0) {
			number_b[b % 10]++;
			b /= 10;
		}
		System.out.println("general digits: ");
		for (int i = 0; i < number_a.length; i++) {
			if (number_a[i] != 0 && number_b[i] != 0) {
				System.out.print(i);
			}
		}

	}

}
