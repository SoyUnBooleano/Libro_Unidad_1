package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_19 {

	public static void main(String[] args) {

		// Una empresa que gestiona un parque acuático te solicita una aplicación que
		// les ayude a calcular el importe que hay que cobrar en la taquilla por la
		// compra de una serie de entradas (cuyo número será introducido por el
		// usuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50€ y de
		// adultos, que cuestan 20€.

		// En el caso de que el importe total sera igual o superior a 100€, se aplicará
		// automáticamente un un bono descuento del 5%.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce cuantas entradas infantiles has vendido");
		int infantil = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce cuantas entradas de adulto has vendido");
		int adulto = Integer.parseInt(sc.nextLine());

		double total = (infantil * 15.5) + (adulto * 20);

		total = total >= 100 ? total * 0.95 : total;

		System.out.printf("El precio total a pagar es %.2f", total);

		sc.close();

	}

}
