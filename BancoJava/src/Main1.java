import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("1. Gestores");
		System.out.println("2. Clientes");
		System.out.println("3. Transferencias");
		System.out.println("4. Mensajes");
		System.out.println("5. Pr�stamos");
		System.out.println("6. Salir");
		
		System.out.println("Introduce n�mero:");
		int numero = keyboard.nextInt();
		
		if (numero == 1) {
			System.out.println("Gestores");
		}
		
		else if (numero == 2) {
			System.out.println("Clientes");
		}
		else if (numero == 3) {
			System.out.println("Transferencias");
		}
		else if (numero == 4) {
			System.out.println("Mensajes");
		}
		else if (numero == 5) {
			System.out.println("Pr�stamos");
		}
		else if (numero == 6){
			System.out.println("Salir");
		}
		
	}

}



