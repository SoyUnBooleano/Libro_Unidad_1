package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_11 {

	public static void main(String[] args) {

		// Un economista te ha encargado un programa para realiazar cálculos con el IVA.
		// La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
		// Muestra la pantalla el importe correspondiente al IVA y al total.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la base imponible");
		double base = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el IVA aplicable");
		double IVA = Double.parseDouble(sc.nextLine());

		double precioIVA = base * (IVA / 100);
		double precioFinal = base + precioIVA;

		System.out.printf("El importe correspondiente al IVA es %.2f € y el precio total del producto es %.2f €",
				precioIVA, precioFinal);

		sc.close();

	}

}
