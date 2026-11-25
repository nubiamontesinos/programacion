package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("NOMBRES DEL MES" + "\nIntroduce un número (1-12): ");
		int mes = Integer.parseInt(sc.nextLine());

		switch (mes) {

		case 1: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Enero");
			break;
		}
		case 2: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Febrero");
			break;
		}
		case 3: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Marzo");
			break;
		}
		case 4: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Abril");
			break;
		}
		case 5: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Mayo");
			break;
		}
		case 6: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Junio");
			break;
		}
		case 7: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Julio");
			break;
		}
		case 8: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Agosto");
			break;
		}
		case 9: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Septiembre");
			break;
		}
		case 10: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Octubre");
			break;
		}
		case 11: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Noviembre");
			break;
		}
		case 12: {
			System.out.println("El mes con posición " + mes + " tiene el nombre Diciembre");
			break;
		}

		}

	}

}
