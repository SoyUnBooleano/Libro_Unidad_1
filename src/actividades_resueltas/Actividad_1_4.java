package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_4 {

	public static void main(String[] args) {

		// Escribir una aplicación que pida el año actual y el de nacimiento del
		// usuario. De calcular su edad, suponiendo que en el año en curso el usuario ya
		// ha cumplido años.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el año en el que estamos");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el año en el que naciste");
		int born = Integer.parseInt(sc.nextLine());

		System.out.println("El usuario tiene " + (year - born) + " años de edad.");

		sc.close();

	}

}
