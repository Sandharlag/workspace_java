import java.util.Scanner;

public class ejercicionumeromayor {


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Introduzca primera nota: ");
		int numero1 = keyboard.nextInt();
		System.out.print("Introduzca primera nota: ");
		int numero2 = keyboard.nextInt();
		
		
		if (numero1 == numero2) {
			System.out.print("No válido");
			keyboard.close();
			return;
		}
		
		
		int numeroMenor, numeroMayor;
		
		if (numero1 > numero2) {
			numeroMayor = numero1;
			numeroMenor = numero2;
		}
		else {
			numeroMayor = numero2;
			numeroMenor = numero1;
		}
		
			for (int i = numeroMenor; i <= numeroMayor; i++) {
				System.out.println(i);
			}
		
		
		
		
	/*
	* Escribe un programa que obtenga los n�meros enteros comprendidos entre dos
	* n�meros introducidos por teclado y validados como distintos
	*/
		
		
		
		keyboard.close();
	}
	}