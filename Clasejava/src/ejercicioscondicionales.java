import java.util.Scanner;

public class ejercicioscondicionales {

	public static void main(String[] args) {
		System.out.println(4.3 >= 4);
		System.out.println(1 == 2);
		System.out.println(4 < 4);
		System.out.println(2 != 5);
		
//Ejercicio: escribe un programa con una variable de tipo entero (a) y un condicional que evalúe si elentero es par o impar utilizando el operador %.
		
		int a = 5;
		
		if (a % 2 == 0) {
		System.out.println("Es par");
		} else {
			System.out.println("Es impar");	
		}
		
//Introducción datos por teclado
	
		//Scanner keyboard = new Scanner(System.in); //esto crea un objeto
		//System.out.println("Introduzca número:");   //promt
		
		//aquí se queda detenido el programa hasta que se pulse intro
		//int numero = keyboard.nextInt();
		//keyboard.close();
		
		
		
		//Realiza un programa que calcule la media de 3 notas
		
		Scanner keyboard = new Scanner(System.in);
		
		// introducir la primera nota
		System.out.print("Introduzca primera nota: ");
		double nota1 = keyboard.nextDouble();
		
		// introducir la segunda nota
		System.out.print("Introduzca segunda nota: ");
		double nota2 = keyboard.nextDouble();
		
		// introducir la tercera nota
		System.out.print("Introduzca tercera nota: ");
		double nota3 = keyboard.nextDouble();
		
		double notaMedia = (nota1 + nota2 + nota3) /3;
		System.out.println(notaMedia);
		//System.out.printf("La nota media es " + notaMedia);
		
		/*
		 * Amplia el programa anterior para que diga la nota media (insuficiente (<5),
		 * suficiente (>=5 y <6), bien(>=6 y <8), notable(>=8 y <9) o sobresaliente(>=9).
		 *  mostrar en pantalla un aviso con println
		 */
		
		
		if (notaMedia <5) {
			System.out.print("Insuficiente");
		}
		else if ((notaMedia >=5) && (notaMedia <6)) {
			System.out.print("Suficiente");
		}
		else if ((notaMedia >=6) && (notaMedia <8)) {
			System.out.print("bien");
		}
		else if ((notaMedia >=8) && (notaMedia <9)) {
			System.out.print("notable");
		}
		else if ((notaMedia >=9) && (notaMedia<=10)) {
			System.out.print("Sobresaliente");
		}
		else {
			System.out.print("No válido");
		}
		
		//operador ternario
		
		//int n2 = (condicion) ? Valor si cumple : valor si no cumple
		//int n6 = (n5 == 6) ? 8 : 10;
		//System.out.println(n6);
		
		

		//excepxiones
		
		
		try {
			System.out.println(1 / 0);			
		} catch (Exception e) {
			System.out.println("Has dividido entre 0");
		}

	//ejemplo
		
	
		
		
		
		
		
		keyboard.close();
	}
}
