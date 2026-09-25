package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_6 {

	public static void main(String[] args) {

		// Crear una aplicación que calcule la media aritmética de dos notas enteras.
		// Hay que tener en cuenta que la media puede contener decimales.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la primera nota");
		int nota1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la segunda nota");
		int nota2 = Integer.parseInt(sc.nextLine());

		double media = (nota1 + nota2) / 2.0;

		System.out.printf("Tu nota media es %.2f", media);

		sc.close();

	}

}
