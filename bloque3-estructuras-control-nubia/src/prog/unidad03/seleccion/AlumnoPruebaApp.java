package prog.unidad03.seleccion;

import java.util.Scanner;

public class AlumnoPruebaApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("APROBADOS Y SUSPENSOS\nIntroduce la calificación de la primera evaluación: ");
		float nota1 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce la calificación de la segunda evaluación: ");
		float nota2 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce la calificación de la tercera evaluación: ");
		float nota3 = Float.parseFloat(sc.nextLine());
		
		float media = (nota1+nota2+nota3)/3;
		
		if (media>=5) {
			System.out.println("El alumno ha aprobado con una media de "+media);
		}
		else {
			System.out.println("El alumno ha suspendido con una media de "+media);
		}
		
		sc.close();
	}

}
