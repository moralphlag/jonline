package by.jonline.module1.part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Найдите значение функции: z = ((a - 3) * b / 2) + c
public class Application_1 {
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter a, b, c: ");
			String[] values = in.readLine().split(" ");
			
			Double a = Double.parseDouble(values[0]);
			Double b = Double.parseDouble(values[1]);
			Double c = Double.parseDouble(values[2]);
			
			Double z = ((a - 3) * b / 2) + c;
			
			System.out.println("Z equals: " + z);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
