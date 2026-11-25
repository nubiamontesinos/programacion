package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraBasicaApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("CALCULADORA BÁSICA\n" + "Operaciones disponibles:" + "\n\tS para suma" + "\n\tR para resta"
				+ "\n\tP para producto (multiplicación" + "\n\tD para división" + "\nIndica la operación: ");
		String opcion = sc.nextLine().toUpperCase();

		System.out.print("Introduce el primer operando: ");
		int numero1 = Integer.parseInt(sc.nextLine());

		System.out.print("Introduce el segundo operando: ");
		int numero2 = Integer.parseInt(sc.nextLine());

		// opciones de operaciones
		switch (opcion) {
		case "S": {
			System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " vale " + (numero1 + numero2));
			break;
		}
		case "R": {
			System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " vale " + (numero1 - numero2));
			break;
		}
		case "P": {
			System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " vale " + (numero1 * numero2));
			break;
		}
		case "D": {
			System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " vale " + (numero1 / numero2));
			break;
		}
		}

		sc.close();
	}
}
