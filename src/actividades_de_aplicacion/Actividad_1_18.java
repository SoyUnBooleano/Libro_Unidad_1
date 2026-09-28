package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_18 {

	public static void main(String[] args) {

		// Un biólogo está realizando un estudio de distintas especies de invertebrados
		// y necesita una aplicación que le ayude a contabilizar el número de patas que
		// tienen en total todos los animales capturados durante una jornada de trabajo.
		// Para ello, te ha solicitado que escribas una aplicación a la que hay que
		// proporcionar:

		// El número de hormigas caputadas (6 patas)

		// El número de arañas capturadas (8 patas)

		// El número de cochinillas capturadas (14 patas)

		// La aplicación debe mostrar el número total de patas

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad de hormigas capturadas");
		int hormiga = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la cantidad de arañas capturadas");
		int arana = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la cantidad de cochinillas capturadas");
		int cochinilla = Integer.parseInt(sc.nextLine());

		int total = (hormiga * 6) + (arana * 8) + (cochinilla * 14);

		System.out.println("El total de patas capturadas es de " + total);

		sc.close();

	}

}
