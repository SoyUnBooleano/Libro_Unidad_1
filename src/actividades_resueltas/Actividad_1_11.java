package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_11 {

	public static void main(String[] args) {

		// Un frutero necesita calcular los beneficios anuales que obtiene de la venta
		// de manzanas y peras. Por este motivo, es necesario diseñar una aplicación que
		// solicite las ventas (en kilos) de cada semestre para cada fruta. La
		// aplicación mostrará el importe total sabiendo que el precio del kilo de
		// manzanas esstás fijado en 2,35€ y el kilo de peras en 1,95€.

		Scanner sc = new Scanner(System.in);

		final double pManzana = 2.35, pPera = 1.95;

		System.out.println("Introduce cuantos kilos de manzana has vendido en el primer semestre");
		int s1Manzana = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce cuantos kilos de peras has vendido en el primer semestre");
		int s1Pera = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce cuantos kilos de manzana has vendido en el segundo semestre");
		int s2Manzana = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce cuantos kilos de peras has vendido en el segundo semestre");
		int s2Pera = Integer.parseInt(sc.nextLine());

		double bManzana = pManzana * (s1Manzana + s2Manzana);
		double bPera = pPera * (s1Pera + s2Pera);
		double total = bPera + bManzana;

		System.out.printf("Has ganado %.2f € en total", total);

		sc.close();

	}

}
