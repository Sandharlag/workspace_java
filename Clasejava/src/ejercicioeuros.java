import java.util.Scanner;

public class ejercicioeuros {


	public static double convertireuros(double euros) {
		long pesetas = (long) (euros * 166.386);
		return pesetas;
	}
	
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca euros: ");
		double euros = keyboard.nextDouble();

		double pesetas = ejercicioeuros.convertireuros(euros);
		System.out.println(pesetas + " pesetas");
	}

}
/*
 * Convertir de Euros a peseta. Escribir un m�todo (convertirEurosAPeseta) que 
 * reciba los euros en double y devuelva el n�mero de pesetas en long
 */