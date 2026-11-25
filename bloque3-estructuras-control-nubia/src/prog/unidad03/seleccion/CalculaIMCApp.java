/*
 * que lea el peso en kg y la altura en metros y mostrar estado (valor imc y diagnóstico)
 */
package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaIMCApp {

	public static void main(String[] args) {

		// uso la clase Scanner para pedir datos de entrada al usuario
		Scanner sc = new Scanner(System.in);

		System.out.println("PROGRAMA DE CÁLCULO DE ÍNDICE DE MASA CORPORAL");

		System.out.print("Introduce tu peso (en kg): ");
		double peso = Double.parseDouble(sc.nextLine());

		System.out.print("Introduce tu altura (en metros): ");
		double altura = Double.parseDouble(sc.nextLine());

		// cálculo de IMC
		final double IMC = peso / (altura * altura);

		String diagnostico;

		// tipos de diagnóstico
		if (IMC < 16) {
			diagnostico = "Ingreso en hospital por infrapeso";
		} else if (IMC < 17) {
			diagnostico = "Infrapeso";
		} else if (IMC < 18) {
			diagnostico = "Bajo peso";
		} else if (IMC < 25) {
			diagnostico = "Peso normal (saludable)";
		} else if (IMC < 30) {
			diagnostico = "Sobrepeso (Obesidad de grado I)";
		} else if (IMC < 35) {
			diagnostico = "Sobrepeso crónico (Obesidad de grado II)";
		} else if (IMC <= 40) {
			diagnostico = "Obesidad premórbida (Obesidad de grado III)";
		} else {
			diagnostico = "Obesidad mórbida (Obesidad de grado IV)";
		}

		// mostrar por pantalla los resultados
		System.out.println("Su IMC es de " + IMC + ", con un diagnóstico de " + diagnostico);

		// cierro Scanner
		sc.close();

	}

}
