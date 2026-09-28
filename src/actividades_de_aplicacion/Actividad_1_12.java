package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_12 {

	public static void main(String[] args) {

		// Escribe un programa que tome como entrada un número entero e indique qué
		// cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:

		// A 2 hay que sumarle 5, par que el resultado sea (2 + 5 = 7) sea múltiplo de
		// 7.

		// A 13 hay que sumarle 1 par que el resultado sea (13 + 1 = 14) sea múltiplo de
		// 7.

		// Si proporcioanas el número 2 o el 13, la salida de la aplicación deber 5 o 1,
		// respectivamente. Pista: el operador módulo puede ser muy útil para solucionar
		// esta actividad.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");
		int num = Integer.parseInt(sc.nextLine());

		int modulo = (7 - num%7) % 7;

		System.out.println("A " + num + " hay que sumarle " + modulo + " para que sea múltiplo de 7.");

		sc.close();

	}

}
