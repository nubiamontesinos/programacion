package prog.unidad03.seleccion;

import java.util.Scanner;

public class EcuacionesSegundoGradoApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CÁLCULO DE ECUACIONES DE SEGUNDO GRADO");
		
		System.out.println("Introduce el valor del coeficiente a: ");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el valor del coeficiente b: ");
		double b = sc.nextDouble();
		
		System.out.println("Introduce el valor del coeficiente c: ");
		double c = sc.nextDouble();
		
		// Validamos que 'a' no sea cero (si no, no es de segundo grado)
		if (a == 0) {
			System.out.println("Error: El coeficiente a debe ser distinto de cero para una ecuación de segundo grado.");
		} else {
			double discriminante = Math.pow(b, 2) - (4 * a * c);
			
			// discriminantes
			if (discriminante > 0) {
				// Dos raíces reales y distintas
				double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("La ecuación tiene dos raíces reales y distintas:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (discriminante == 0) {
				// Dos raíces reales e iguales (raíz doble)
				double x = -b / (2 * a);
				System.out.println("La ecuación tiene dos raíces reales e iguales:");
				System.out.println("x = " + x);
			} else {
				// Sin raíces reales (discriminante negativo)
				System.out.println("La ecuación no tiene raíces reales (sus raíces son complejas).");
			}
		}
		
		sc.close();
	}
}