package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_14 {

	public static void main(String[] args) {

		// Realizar un programa que pida como entrada un número decimal y lo muestre
		// redondeado al entero más próximo.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número decimal");
		double num = Double.parseDouble(sc.nextLine());
		
		double redo = num + 0.5;
		int redondeo = (int) redo;
	
		System.out.println(redondeo);
		
		sc.close();

	}

}
