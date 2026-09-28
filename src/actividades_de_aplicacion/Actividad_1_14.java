package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_14 {

	public static void main(String[] args) {

		// Crea un programa que pida la base y la altura de un triángulo y muestre su
		// área.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la base del triángulo");
		double base = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la altura del triángulo");
		double altura = Double.parseDouble(sc.nextLine());

		double area = (base * altura) / 2;

		System.out.printf("El área del triángulo cuya base es %.2f y altura es %.2f, es %.2f", base, altura, area);

		sc.close();

	}

}
