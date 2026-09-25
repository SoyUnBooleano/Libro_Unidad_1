package actividades_de_aplicacion;

public class Actividad_1_20 {

	public static void main(String[] args) {

		// Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el
		// porgrama utilizando el nombre cualificado de las clases, en lugar de utilizar
		// ninguna importación.

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Introduce un número real");
		double num = Double.parseDouble(sc.nextLine());

		double raiz = java.lang.Math.sqrt(num);

		System.out.println("La raíz cuadrada de " + num + " es " + raiz);

		sc.close();

	}

}
