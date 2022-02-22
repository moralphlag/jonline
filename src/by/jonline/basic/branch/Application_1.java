package by.jonline.basic.branch;

public class Application_1 {
	public static void main(String[] args) {
		
		int angle1 = 45;
        int angle2 = 180;

        if ((angle1 < 0) || angle2 < 0)
        {
            System.out.println("the angle is lower than zero.");
            return;
        }
        if (angle1 + angle2 >= 180) {
            System.out.println("The triangle doesn't exist.");
        }
        else
        {
            if ((180 - (angle1 + angle2)) == 90)
                System.out.println("There is a right triangle.");
            else
                System.out.println("The triangle existes.");
        }
	}
}
