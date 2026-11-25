package funciones;

import java.util.Scanner;

public class ParseClase {
	public static void main (String[] args) {
		
		// PEDIR Y ALMACENAR DATOS
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dame tu edad: ");
		byte edad=Byte.parseByte(sc.nextLine()); // Clase.parseTipo(sc.nextLine) para no tener problemas con el buffer
		
		System.out.println("Tu edad es: "+edad);
	}
}
