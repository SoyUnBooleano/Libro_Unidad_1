package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_16 {

	public static void main(String[] args) {

		// Diseña una aplicación que solicite al usuario que introduzca una cantidad de
		// segundos. La aplicación debe mostrar cuantas horas, minutos y segundos hay en
		// el número de segundos introducidos por el usuario.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de segundos");
		int units = Integer.parseInt(sc.nextLine());
		int hour = units / 3600;
		units %= 3600;
		int min = units / 60;
		int seg = units % 60;

		System.out.println("Hay " + hour + " horas, " + min + " minutos y " + seg + " segundos.");

		sc.close();

	}

}
