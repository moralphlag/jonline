package by.jonline.module1.part1;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в
 * секундах. Вывести данное значение длительности в часах , минутах и секундах в след. форме:
 * ННч ММмин SSc */
public class Application_5 {
	public static void main(String[] args) {
        int T = 36666;

        int h = T / 3600;
        int m = (T - (h * 3600)) / 60;
        int s = T - (h * 3600) - (m * 60);

        System.out.println(h + "h" + m + "m" + s + "s");

	}
}
