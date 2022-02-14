package by.jonline.module1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application_1 {
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter a, b, c: ");
			Double a = Double.parseDouble(in.readLine());
			Double b = Double.parseDouble(in.readLine());
			Double c = Double.parseDouble(in.readLine());
			
			Double z = ((a - 3) * b / 2) + c;
			
			System.out.println("Z equals: " + z);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
