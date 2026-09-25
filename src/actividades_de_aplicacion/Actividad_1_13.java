package actividades_de_aplicacion;

import java.util.Scanner;

public class Actividad_1_13 {

	public static void main(String[] args) {

		// Modifica la Actividad 1_12 para que, indicando dos números n y me, diga que
		// cantidad hay que sumarle a n para que sea múltiplo de m.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número n");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce un número m");
		int m = Integer.parseInt(sc.nextLine());
		
		int o = n%m != 0? (n%m - m) *-1: 0;
		String mensaje = o!= 0 ? "A "+n+" hay que sumarle "+o+" para que sea múltiplo de "+m : n+" es múltiplo de "+m;
		
		System.out.println(mensaje);
		
		sc.close();

	}

}
