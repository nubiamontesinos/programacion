package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float horasTrabajadas;
		float horasExtra;
		float salario;

		// obrero cobra 16e/h normal y 20e/h por h extra (+40 horas semanales)

		System.out.println("PROGRAMA CALCULADOR DE SALARIOS");

		System.out.print("Introduce las horas trabajadas esta semana: ");
		// lo declaro como float por si han sido 36 horas y media por ejemplo
		horasTrabajadas = Float.parseFloat(sc.nextLine());

		// si hay horas extra, se resta el número a 40 para que queden cuántas son extra
		if (horasTrabajadas > 40f)
			horasExtra = horasTrabajadas - 40f;
		else
			horasExtra = 0f;

		salario = ((horasTrabajadas - horasExtra) * 16) + horasExtra * 20;
		System.out.println("El salario por trabajar " + horasTrabajadas + " horas y " + horasExtra
				+ " de ellas extra, es de " + salario);

		sc.close();
	}

}
