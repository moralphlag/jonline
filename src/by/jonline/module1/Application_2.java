package by.jonline.module1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application_2 {
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Enter a, b, c: ");
			String[] values = in.readLine().split(" ");
			
			Double a = Double.parseDouble(values[0]);
			Double b = Double.parseDouble(values[1]);
			Double c = Double.parseDouble(values[2]);
			
			Double z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) 
					/ (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			
			System.out.println("Z equals: " + z);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
