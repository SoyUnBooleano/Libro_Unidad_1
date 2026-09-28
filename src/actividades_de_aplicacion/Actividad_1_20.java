package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_20 {

	public static void main(String[] args) {

		// Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el
		// programa utilizando el nombre cualificado de las clases, en lugar de utilizar
		// ninguna importación.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		double num = Double.parseDouble(sc.nextLine());

		double raiz = Math.sqrt(num);

		System.out.printf("La raíz cuadrada de %.2f es %.2f", num, raiz);

		sc.close();

	}

}
