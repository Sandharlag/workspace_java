import java.util.Scanner;

public class ejercicionumerosprimos {

	public static boolean esPrimo (int numero) {
		for(int i=numero-1; i >= 2; i--) {
			if(numero % i == 0) {
				//si no es primo
				return false;
			}
		}
		//si es primo
		return true;
	}
	
	
	
	public static void main(String[] args) {
		

		/*ejercicio de numeros primos
		 * 
		 * Ejercicio: escribe un programa que dado un n�mero, calcule si es primo o no.
		 * Un n�mero primo es un n�mero natural mayor que 1 que tiene �nicamente dos
		 * divisores distintos: �l mismo y el 1.
	*/	 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int numero = keyboard.nextInt();

		/*for(int i=numero-1; i >= 2; i--) {
			//System.out.println(i);
			System.out.println(numero + "%" + i + " = " + numero%i);
			if(numero % i == 0) {
				System.out.println("No es primo");
				break;
		/*	}
			
	 
		 
		/*
 * Crear un m�todo que se llama esPrimo. Reciba un n�mero entero (int) y devuelva un 
 * booleano. Si el n�mero es primo entonces tiene que devolver true y si no, false
 */
		
		if(ejercicionumerosprimos.esPrimo(numero)) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}	
	}
	}




