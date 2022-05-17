import java.util.Scanner;

public class metodos {
	
	public static int sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}
	
	public static int restar(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		return resultado;
	}
	
	public static int multiplicar(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	public static int dividir(int numero1, int numero2) {
		int resultado = numero1 / numero2;
		return resultado;
	}
	/*
	 * Implementar m�todos restar, multiplicar y dividir. Tienen que devolver un entero
	 * (int). Invocar los tres m�todos con los dos n�meros introducidos por el usuario
	 * y mostrar el resultado por pantalla
	 */
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		int numero1 = keyboard.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		int numero2 = keyboard.nextInt();
		
		System.out.println("Introduzca operación: 1=+, 2=-; 3=*, 4=/");
		int operacion = keyboard.nextInt();
		
		if(operacion == 1) {
			System.out.println(metodos.sumar(numero1, numero2));
		}
		
		else if(operacion == 2) {
			System.out.println(metodos.restar(numero1, numero2));
		}
		
		else if (operacion == 3) {
			System.out.println(metodos.multiplicar(numero1, numero2));
			
		}
		else if (operacion == 4) {
			System.out.println(metodos.dividir(numero1, numero2));
		}
		
		else {
			System.out.println(metodos.dividir("No existe la operacion"));
		}
		
		//metodos.restar(numero1, numero2);
		
		//int numero3 = metodos.sumar(12, 4);
		//System.out.println(numero3);
	}
}










