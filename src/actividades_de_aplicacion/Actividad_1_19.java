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

		final double entradaInfantil = 15.50;
		final double entradaAdulto = 20;

		System.out.println("Introduce cuantas entradas infantiles has vendido");
		int numInfantil = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce cuantas entradas adultas has vendido");
		int numAdulto = Integer.parseInt(sc.nextLine());

		double total = (entradaInfantil * numInfantil) + (entradaAdulto * numAdulto);
		double descuento = total >= 100 ? total * 0.95 : total;
		descuento = Math.round(descuento * 100.0) / 100.0;

		String mensaje = (total >= 100)
				? "Se ha aplicado un descuento del 5% y el precio final de las entradas es " + descuento + " €"
				: "El precio total de las entradas es de " + descuento + " €";

		System.out.println(mensaje);

		sc.close();

	}

}
