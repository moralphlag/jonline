package by.jonline.module1.part3;

//Вычислите значение функции на отрезке [a, b] с шагом h.
public class Application_2 {
	public static void main(String[] args) {

        int a = -8;
        int b = 10;
        int h = 1;

        int f = 0;
        for (int x = a; x <= b; x += h)
        {
            if (x > 2)
            {
                f = x;
                System.out.println("F(" + x + ") is " + f);
            }
            else
            {
                f = -x;
                System.out.println("F(" + x + ") is " + f);
            }
        }

	}
}
