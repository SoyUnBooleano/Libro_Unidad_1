package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_13 {

	public static void main(String[] args) {

		// Escribir un programa que solicite las notas del primer, segundo y tercer
		// trimestre (notas enteras que se solicitarán al usuario). El programa debe
		// mostrar la nota media del curso como se utiliza en el boletín de
		// calificaciones (solo la parte entera) y como se usa en el expediente
		// académico (con decimales).

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la nota del primer trimestre");
		int nota1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la nota del segundo trimestre");
		int nota2 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la nota del tercer trimestre");
		int nota3 = Integer.parseInt(sc.nextLine());

		double mediaExp = (nota1 + nota2 + nota3) / 3.0;
		int mediaCali = (int) mediaExp;

		System.out.printf("La media en el boletín de calificaciones es %d y la media del expediente académico es %.2f%n",
				mediaCali, mediaExp);

		sc.close();

	}

}
