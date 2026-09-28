package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_21 {

	public static void main(String[] args) {

		// Pide dos números al usuario a y b. Deberá mostrarse true si ambos números son
		// iguales y false en caso contrario.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número a");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce un número b");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println(a == b);

		sc.close();

	}

}
