package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_17 {

	public static void main(String[] args) {

		// Solicita al usuario tres distancias:

		// La primera, medida en milímetros

		// La segunda, medida en centímetros

		// La última, medida en metros

		// Diseña un programa que muestre la suma de las tres longitudes introducidas
		// (medida en centímetros)

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una medida en milímetros");
		double mm = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce una medida en centímetros");
		double cm = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce una medida en metros");
		double m = Double.parseDouble(sc.nextLine());

		double total = (mm / 10) + cm + (m * 100);

		System.out.printf("La suma de las tres longitudes es %.2f", total);

		sc.close();

	}

}
