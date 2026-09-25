package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_14 {

	public static void main(String[] args) {

		// Realizar un programa que pida como entrada un número decimal y lo muestre
		// redondeado al entero más próximo.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número decimal");
		double num = Double.parseDouble(sc.nextLine());

		int num2 = (int) Math.round(num);

		System.out.println(num2);

		sc.close();

	}

}
