package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosParesImparesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroComienzoIntervalo;
		int numeroFinIntervalo;

		System.out.println("PARES O IMPARES EN UN INTERVALO");

		System.out.print("Introduce el número de comienzo del intervalo: ");
		numeroComienzoIntervalo = Integer.parseInt(sc.nextLine());

		System.out.print("Introduce el número de fin del intervalo: ");
		numeroFinIntervalo = Integer.parseInt(sc.nextLine());
		
		while (numeroComienzoIntervalo > numeroFinIntervalo) {
			System.err.println("Error. El número de inicio (" + numeroComienzoIntervalo
					+ ") debe ser menor o igual al de final (" + numeroFinIntervalo + ").\nInténtelo de nuevo");
			System.out.print("Introduce el número de comienzo del intervalo: ");
			numeroComienzoIntervalo = Integer.parseInt(sc.nextLine());

			System.out.print("Introduce el número de fin del intervalo: ");
			numeroFinIntervalo = Integer.parseInt(sc.nextLine());
		}

		for (int i = numeroComienzoIntervalo; i <= numeroFinIntervalo; i++) {
			if (i % 2 == 0) {
				System.out.println("El número " + i + " es par");
			} else {
				System.out.println("El número " + i + " es impar");
			}
		}
	}

}
