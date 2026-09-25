package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_15 {

	public static void main(String[] args) {

		// Dado el siguiente polinomio de segundo grado:

		// y = ax² + bx + c

		// crea un programa que pida los coeficientes a, b y c, así como el valor de x,
		// calcula el valor correspondiente de y.

		Scanner sc = new Scanner(System.in);

		System.out.println("Dado el polinomio : y = ax² + bx + c");
		System.out.println("Introduce el valor de a");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el valor de b");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el valor de c");
		double c = Double.parseDouble(sc.nextLine());
		System.out.println("Ahora introduce el valor de x");
		double x = Double.parseDouble(sc.nextLine());

		double y = a * Math.pow(x, 2) + b * x + c;

		System.out.printf("El valor de y es: %.2f", y);

		sc.close();
	}

}
