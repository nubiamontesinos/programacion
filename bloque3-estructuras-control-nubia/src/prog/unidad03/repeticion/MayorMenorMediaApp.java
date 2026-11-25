package prog.unidad03.repeticion;

import java.util.Scanner;

public class MayorMenorMediaApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("MAYOR, MENOR Y MEDIA\n¿Cuántos números deseas introducir?: ");
		int cantidadNumeros = Integer.parseInt(sc.nextLine());

		float mayor = 0;
		float menor = 0;
		float suma = 0;

		for (int i = 1; i <= cantidadNumeros; i++) {
			System.out.print("Introduce el número " + i + ": ");
			float numero = Float.parseFloat(sc.nextLine());

			// primero es ambos (mayor y menor) hasta que se actualice con las comparaciones
			if (i == 1) {
				mayor = numero;
				menor = numero;
			} else {
				// comparo número para actualizar el mayor
				if (numero > mayor) {
					mayor = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}

			// suma de números
			suma =suma+numero;
		}

		// calculo media
		if (cantidadNumeros > 0) {
			float media = suma / cantidadNumeros;
			System.out.println("El mayor de los números introducidos ha sido: " + mayor
					+ "\nEl menor de los números introducidos ha sido: " + menor
					+ "\nLa media de los números introducidos es: " + media);
		} else {
			System.out.println("No se han introducido números.");
		}

		sc.close();
	}
}
