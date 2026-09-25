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
		int birth = Integer.parseInt(sc.nextLine());

		int age = year - birth;

		System.out.println("Tienes actualmente " + age + " años.");

		sc.close();

	}

}
