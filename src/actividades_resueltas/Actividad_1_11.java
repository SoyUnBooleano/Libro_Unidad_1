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

		final double kiloManzana = 2.35;
		final double kiloPera = 1.95;

		System.out.println("Introduce cuantos kilos de manzanas vendiste durante el primer semestre");
		double sem1Man = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce cuantos kilos de manzanas vendiste durante el segundo semestre");
		double sem2Man = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce cuantos kilos de peras vendiste durante el primer semestre");
		double sem1Per = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce cuantos kilos de peras vendiste durante el segundo semestre");
		double sem2Per = Double.parseDouble(sc.nextLine());

		double total = (sem1Man + sem2Man) * kiloManzana + (sem1Per + sem2Per) * kiloPera;

		System.out.printf("El importe total es de %.2f €.", total);

		sc.close();

	}

}
