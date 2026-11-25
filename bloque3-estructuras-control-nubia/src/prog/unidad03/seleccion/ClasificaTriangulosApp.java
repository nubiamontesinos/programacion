package prog.unidad03.seleccion;

import java.util.Scanner;

public class ClasificaTriangulosApp {
	
	public static void main(String[] args) {
		
		System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
		
		Scanner sc=new Scanner(System.in);
		
		// pido lados
		System.out.print("Introduce la longitud del primer lado: ");
		float lado1 = Float.parseFloat(sc.nextLine());
		
		System.out.print("Introduce la longitud del segundo lado: ");
		float lado2 = Float.parseFloat(sc.nextLine());
		
		System.out.print("Introduce la longitud del tercer lado: ");
		float lado3 = Float.parseFloat(sc.nextLine());
		
		// triangulos
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triángulo es equilátero");
		}
		
		else if (lado1 == lado2 | lado1 == lado3 | lado2 == lado3) {
			System.out.println("El triángulo es isóceles");
		}
		
		else {
			System.out.println("El triángulo es escaleno");
		}
		// equilatero, isóceles o escaleno
	}

}
