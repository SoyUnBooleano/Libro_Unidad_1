package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_12 {

	public static void main(String[] args) {

		// Escribir un programa que pida un número al usuario y meustre su valor
		// absoluto.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());

		int abs = Math.abs(num);

		System.out.println("Su valor absoluto es " + abs);

		sc.close();
	}

}
