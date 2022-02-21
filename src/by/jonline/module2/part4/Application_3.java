package by.jonline.module2.part4;

public class Application_3 {

	public static void main(String[] args) {
		System.out.printf("Polygon area with %d angles equils %f", 6, polygonArea(5, 6));
	}
	
	public static double triangleArea(double a) {
		return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
	}
	
	/**
	 * polygonArea returns polygon area;
	 * @param a - side length;
	 * @param n - number of angle;
	 * @return - polygon area;
	 */
	public static double polygonArea(double a, int n) {
		return n * triangleArea(a);
	}
}
