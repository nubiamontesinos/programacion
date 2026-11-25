package funciones;
import java.util.Scanner;

public class Validador {
    // scanner para toda la clase
    private static final Scanner sc = new Scanner(System.in);

    public static String pideTexto() {
        System.out.println("Escribe el texto:"); 
        return sc.nextLine();
    }

    public static String pedirEmail() {
        String texto = pideTexto();

        // recursividad
        if (!validarEmail(texto)) {
            System.out.println("Email no válido. Inténtalo de nuevo.");
            texto = pedirEmail();
        }
        return texto;
    }

public static boolean validarEmail(String email) {
		
		if (email.length()<6) {
			return false;
		}
		
		if (!email.contains("@")) {
			return false;
		}
		if (!email.endsWith(".com") ||!email.endsWith(".es")) {
			return false;
		}
		
		if (email.startsWith("0") 
				|| email.charAt(0)=='1'
				|| email.charAt(0)=='2'|| email.charAt(0)=='3'
				|| email.charAt(0)=='4'|| email.charAt(0)=='5'
				|| email.charAt(0)=='6'|| email.charAt(0)=='7'
				|| email.charAt(0)=='8'|| email.charAt(0)=='9') {
			return false;
		}
		if (email.equals("admin@midominio.com")) {
			return false;
		}
		return true;
	}

    public static void main(String[] args) {
        String emailValido = pedirEmail();
        System.out.println("El email guardado es: " + emailValido);
    }
}
