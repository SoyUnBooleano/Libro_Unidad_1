package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_7 {

	public static void main(String[] args) {

		// Diseñar una aplicación que calcule la longitud y el área de una
		// circunferencia. Para ello, el usuario debe introducir el radio (que puede
		// contener decimales)

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el radio de la circunferencia y calcularé la longitud y el área de ésta.");
		double radio = Double.parseDouble(sc.nextLine());

		double longitud = 2 * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2);

		System.out.printf("La longitud de la circunferencia es %.2f y su área es %.2f", longitud, area);

		sc.close();

	}

}
