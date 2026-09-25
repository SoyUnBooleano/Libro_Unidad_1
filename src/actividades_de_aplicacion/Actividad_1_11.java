package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_11 {

	public static void main(String[] args) {

		// Un economista te ha encargado un programa para realiazar cálculos con el IVA.
		// La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
		// Muestra la pantalla el importe correspondiente al IVA y al total.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la base del producto");
		double base = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el IVA que se le debe aplicar");
		double IVA = Double.parseDouble(sc.nextLine());

		double importeIVA = base * (IVA / 100);
		double importeTotal = importeIVA + base;

		System.out.printf("El producto tiene un precio base de %.2f €, un porcentaje de IVA del %.2f %%. %n", base,
				IVA);
		System.out.printf(
				"Por tanto, el importe correspondiente al IVA es de %.2f € y el importeTotal del producto es de %.2f €.%n",
				importeIVA, importeTotal);

		sc.close();

	}

}
