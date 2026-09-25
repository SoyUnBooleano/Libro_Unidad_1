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
		int t1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la nota del segundo trimestre");
		int t2 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la nota del tercer trimestre");
		int t3 = Integer.parseInt(sc.nextLine());

		double exp = (t1 + t2 + t3) / 3.0;
		int boletin = (int) exp;

		System.out.printf("La media en el boletín es %d y la media en el expediente es %.2f", boletin, exp);

		sc.close();

	}

}
