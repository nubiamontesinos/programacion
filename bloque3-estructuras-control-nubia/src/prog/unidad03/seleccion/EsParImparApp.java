package prog.unidad03.seleccion;

import java.util.Scanner;

public class EsParImparApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("¿PAR O IMPAR?"
				+ "\nIntroduce un número entero: ");
		
		byte numero = Byte.parseByte(sc.nextLine());
		
		if (numero %2 == 0) {
			System.out.println("El número "+numero+" es par");
		}
		else {
			System.out.println("El número "+numero+" es impar");
		}
		
		sc.close();
	}

}
