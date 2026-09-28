package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_16 {

	public static void main(String[] args) {

		// Diseña una aplicación que solicite al usuario que introduzca una cantidad de
		// segundos. La aplicación debe mostrar cuantas horas, minutos y segundos hay en
		// el número de segundos introducidos por el usuario.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de segundos");
		int seg = Integer.parseInt(sc.nextLine());

		int hora = seg / 3600;
		int min = (seg % 3600) / 60;
		int seg2 = seg % 60;

		System.out.println(
				"En " + seg + " segundos hay: " + hora + " horas, " + min + " minutos y " + seg2 + " segundos.");

		sc.close();
	}

}
