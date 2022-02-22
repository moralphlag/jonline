package by.jonline.algoritmization.decomposition;

/* На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими 
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/

public class Application_4 {
	
	Point[] pointsArray;

	Application_4() {
		this.writePointArray();
	}
	
	public static void main(String[] args) {
		Application_4 app_4 = new Application_4();

		Point[] maxDistancePoints = maxDistance(app_4.pointsArray);
		System.out.printf("Max distance between point %1$4.3f, %2$4.3f and %3$4.3f, %4$4.3f",
				maxDistancePoints[0].getX(), maxDistancePoints[0].getY(), maxDistancePoints[1].getX(),
				maxDistancePoints[1].getY());
	}
	/**
	 * Записываем точки
	 */
	void writePointArray() {
		pointsArray = new Point[5];

		pointsArray[0] = new Point(1, 1);
		pointsArray[1] = new Point(2, 2);
		pointsArray[2] = new Point(3, 3);
		pointsArray[3] = new Point(4, 4);
		pointsArray[4] = new Point(5, 5);
	}
	/**
	 * Находит две точки с максимальным расстоянием между ними
	 * @param pointsArray - массив точек
	 * @return Возвращает две точки с максимальным расстоянием между ними
	 */
	static Point[] maxDistance(Point[] pointsArray) {
		double maxDistance = 0;
		Point[] maxDistancePoints = new Point[2];
		for (int j = 0; j < pointsArray.length; j++) {
			for (int i = j; i < pointsArray.length; i++) {
				if (maxDistance < Point.distance(pointsArray[j], pointsArray[i])) {
					maxDistance = Point.distance(pointsArray[j], pointsArray[i]);
					maxDistancePoints[0] = pointsArray[j];
					maxDistancePoints[1] = pointsArray[i];
				}
			}
		}
		System.out.printf("Max distance is %4.3f\n", maxDistance);
		return maxDistancePoints;
	}
}

/**
 * @brief класс точки Point
 */
class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	void setX(double x) {
		this.x = x;
	}

	void setY(double y) {
		this.y = y;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	static double distance(Point point1, Point point2) {
		return (Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2)));
	}

}