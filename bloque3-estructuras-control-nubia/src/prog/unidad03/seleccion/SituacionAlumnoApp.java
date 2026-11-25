package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("PROMOCIONA O NO PROMOCIONA\nIntroduce la calificación de Matemáticas: ");
		float notaMates = Float.parseFloat(sc.nextLine());

		System.out.println("PROMOCIONA O NO PROMOCIONA\nIntroduce la calificación de Lengua: ");
		float notaLengua = Float.parseFloat(sc.nextLine());

		if (notaMates >= 5 && notaLengua >= 5) {
			System.out.println("El alumno promociona con todo aprobado");
		} else if ((notaMates < 5 && notaLengua >= 5) || (notaMates >= 5 && notaLengua < 5)) {
			System.out.println("El alumno promociona con una asignatura pendiente");
		} else {
			System.out.println("El alumno no promociona");
		}

		sc.close();
	}
}