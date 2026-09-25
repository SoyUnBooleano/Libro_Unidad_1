package actividades_resueltas;

import java.util.Scanner;

public class Actividad_1_10 {

	public static void main(String[] args) {

		// Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen
		// aspetos que influirán en esta decisión: si está lloviendo y si hemos
		// terminado nuestras tareas. Solo podremos salir a la calle si no está
		// lloviendo y hemos finalizado nuestras tareas. Existe una opción en la que,
		// indistintamente de lo anterior, podremos salir a la calle: el hecho de que
		// tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un
		// libro, etc..). Solicitar al usuario (mediante un booelano) si llueve, si ha
		// finalizado las tareas y si necesita ir a la biblioteca. El algoritmo debe
		// mostrar mediante un booelano (true o false) si es posbile que se le otorgue
		// permiso para ir a la calle.

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Está lloviendo?");
		boolean rain = Boolean.parseBoolean(sc.nextLine());
		System.out.println("¿Has finalizado tus tareas?");
		boolean done = Boolean.parseBoolean(sc.nextLine());
		System.out.println("¿Necesitas ir a la biblioteca?");
		boolean book = Boolean.parseBoolean(sc.nextLine());

		boolean exit = (!rain && done) || book;

		System.out.println("¿Puedes salir a la calle? " + exit);

		sc.close();

	}

}
