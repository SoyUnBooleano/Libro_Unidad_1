package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_15 {

	public static void main(String[] args) {

		// Dado el siguiente polinomio de segundo grado:

		// y = ax² + bx + c

		// crea un programa que pida los coeficientes a, b y c, así como el valor de x,
		// calcula el valor correspondiente de y.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el coeficiente a");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el coeficiente b");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el coeficiente c");
		int c = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el valor x");
		int x = Integer.parseInt(sc.nextLine());

		int y = a * (x * x) + b * x + c;

		System.out.println("El resultado del polinomio es " + y);

		sc.close();

	}

}
