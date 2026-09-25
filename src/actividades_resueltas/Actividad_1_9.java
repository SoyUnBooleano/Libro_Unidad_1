package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_9 {

	public static void main(String[] args) {

		// Escribir un programa que pida un número al usuario e indique mediante un
		// literal booleano (true o false) si el número es par.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println(num % 2 == 0);

		sc.close();

	}

}
