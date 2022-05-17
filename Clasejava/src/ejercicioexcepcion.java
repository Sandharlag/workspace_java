
import java.util.Scanner;

public class ejercicioexcepcion {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Solicitar al usuario un n�mero y si introduce una letra o un string, mostrar
		 * un mensaje por pantalla
		 */
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca el primer n�mero: ");
		
		try {
			int numero1 = keyboard.nextInt();		
		} catch (Exception e) {
			System.out.println("No es un número");
			return;
		}
		
		
		keyboard.close();
	}
}