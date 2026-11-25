package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaPareasImparesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		System.out.print("CUENTA PARES O IMPARES\n¿Cuántos pares deseas introducir?: ");
		int cantidadNumeros = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= cantidadNumeros; i++) {
			System.out.print("Introduce el número " + i + ": ");
			int numero = Integer.parseInt(sc.nextLine());

			if (numero % 2 == 0) {
				System.out.println("El número " + numero + " es par");
				pares++;
			} else {
				System.out.println("El número " + numero + " es impar");
				impares++;
			}
		}
		System.out.println("Se han introducido " + pares + " números pares y " + impares + " números impares");
	}

}
