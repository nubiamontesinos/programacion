package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float numero;
		int paresIntroducir;
		int paresConseguidos = 0;

		System.out.print("CUENTA PARES\n¿Cuántos números pares deseas introducir?: ");
		int cantidadPares = Integer.parseInt(sc.nextLine());
		paresIntroducir = cantidadPares;

		while (paresConseguidos < cantidadPares) {
			System.out.print("Introduce el número " + (paresConseguidos + 1) + ": ");
			numero = Float.parseFloat(sc.nextLine());

			if (numero % 2 == 0) {
				paresConseguidos++;
				paresIntroducir--;
			} else {
				System.out.println("Te quedan " + paresIntroducir + " pares por introducir");
			}
		}

		System.out.println("¡Ya has introducido " + cantidadPares + " números pares!");
		sc.close();
	}
}