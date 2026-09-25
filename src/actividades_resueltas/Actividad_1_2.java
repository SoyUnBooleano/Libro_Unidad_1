package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_2 {

	public static void main(String[] args) {

		// Diseñar un programa que pida un número al usuario - por teclado - y a
		// continuación lo muestre.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("El numero que has introducido es " + num);

		sc.close();
	}

}
