package funciones;

import java.util.Scanner;

public class EjemploExamen {
// pide nombre y varias notas al usuario e indica si pasa de curso (media >= 5)

	public static void main (String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		float notaProgramacion;
		float notaSistemas;
		float notaEntornos;
		float notaLenguajeMarcas;
		
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Dime tu nota en Programación: ");
		notaProgramacion = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Dime tu nota en Sistemas: ");
		notaSistemas = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Dime tu nota en Entornos: ");
		notaEntornos = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Dime tu nota en Lenguaje de Marcas: ");
		notaLenguajeMarcas = Float.parseFloat(teclado.nextLine());
		
		float media = (notaProgramacion+notaSistemas+notaEntornos+notaLenguajeMarcas)/4; 
		boolean pasaDeCurso = media>=5;
		
		// salida por pantalla
		System.out.println("\nAlumno: "+nombre+"\nPasa de curso: "+pasaDeCurso+"\nNota media: "+media);
		
		// cierro escáner
		teclado.close();
	}

}
