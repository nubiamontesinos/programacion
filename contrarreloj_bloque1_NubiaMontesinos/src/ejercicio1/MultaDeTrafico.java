/*
 * Objetivo: calcular valor de una multa a pagar por el dueño de un coche.
 * Total a pagar = multa base + porcentaje de incremento de velocidad + conductor 
 * donde:
 * multa base: es de 200€
 * porcentaje de incremento de velocidad: Se debe de calcular el porcentaje que incrementa la velocidad el vehículo. 
 * Por ejemplo si el límite de velocidad es de 100KM/h y el coche iba a 110Km/h, la cantidad de multa base se incrementa en el mismo porcentaje. En este caso un 10%. Es decir, en 20€.
 * Por último se incrementará un total de 100€ en el caso de que el vehículo sea conducido por el titular del coche.
 * 
 * Autor: Nubia Montesinos
 * Fecha: 3/11/26
 */
package ejercicio1;

import java.util.Scanner;

public class MultaDeTrafico {
	
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("CÁLCULO DE MULTA\n");
		
		int multaBase=200;
		int velocidadLimite;
		int velocidad;
		float porcentajeIncremento=0;
		boolean titular=false;
		float conductorTasa=100;
		float totalPagar = multaBase;

		System.out.print("Límite velocidad: ");
		velocidadLimite=sc.nextInt();
		
		System.out.print("Indica la velocidad: ");
		velocidad=sc.nextInt();
		
		sc.nextLine();
		
		if (velocidad<=velocidadLimite) {
			System.out.println("No hay multa.");
			
		}
		else {
			// sí hay multa:
			System.out.println("\nMulta base: 200€");
			
			porcentajeIncremento = ((velocidad - velocidadLimite) * 100.0f) / velocidadLimite;
			
			float dineroIncremento = (porcentajeIncremento / 100) * multaBase;
			System.out.println("Incremento velocidad (" + porcentajeIncremento + "%): +" + dineroIncremento + "€");
			
			System.out.print("¿El coche estaba siendo conducido por el titular? (S/N): ");
			String conductor = sc.nextLine().toLowerCase();
			
			if (conductor.equals("s")) {
				titular = true;
				totalPagar = multaBase + dineroIncremento + conductorTasa;
				System.out.println("+100€ por titular");
			}
			else if (conductor.equals("n")) {
				titular = false;
				totalPagar = multaBase + dineroIncremento;
			}
			System.out.println("\nTOTAL A PAGAR: "+totalPagar + "€");
		}
		
		sc.close();
	}
}
