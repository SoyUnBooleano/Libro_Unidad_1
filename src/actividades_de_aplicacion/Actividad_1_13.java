package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_13 {

	public static void main(String[] args) {

		// Modifica la Actividad 1_12 para que, indicando dos números n y m, diga que
		// cantidad hay que sumarle a n para que sea múltiplo de m.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce otro número");
		int m = Integer.parseInt(sc.nextLine());

		int modulo = (m - n % m) % m;

		System.out.println("A " + n + " hay que sumarle " + modulo + " para que sea múltiplo de " + m);

		sc.close();

	}

}
