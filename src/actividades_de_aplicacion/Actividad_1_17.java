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

		System.out.println("Introduce la primera medida (mm)");
		double mm = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la segunda medida (cm)");
		double cm = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la última medida (m)");
		double m = Double.parseDouble(sc.nextLine());

		double suma = (mm / 10) + cm + (m * 100);

		System.out.printf("La suma total de las tres medidas es: %.2f centímetros.", suma);

		sc.close();

	}

}
