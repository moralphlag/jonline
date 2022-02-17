package by.jonline.module1.part3;

import java.util.Scanner;

public class Application_1 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¬ведите число: ");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
		}
		int n = sc.nextInt();

		int return_value = 0;
		for (int i = 0; i <= n; ++i) {
			return_value += i;
		}
		System.out.println("The sum is " + return_value);
	}
}
