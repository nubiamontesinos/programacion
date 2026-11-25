package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("CIFRAS DE UN NÚMERO\nIntroduce un número entero y te diré cuántas cifras tiene: ");
		byte numero = Byte.parseByte(sc.nextLine());
		
		// convierto numero en String y lo asocio a la variable cifras
		String cifras = Integer.toString(numero);
		
		// uso cifras.length para obtener la cantidad de cifras del número
		System.out.println("El número "+numero+" tiene "+cifras.length()+" cifras");
		
	}

}
