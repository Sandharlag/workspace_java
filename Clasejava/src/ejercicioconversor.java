import java.util.Scanner;

public class ejercicioconversor {

	public static double convertirKmAUA(long km) {
		double ua = km / 150000000.0;
		return ua;
	}
	
	public static void main(String[] args) {
	
		/*
		 * Convertir de Unidad Astron�mica (UA) a km. Escribir un m�todo (convertirKmAUA) que 
		 * reciba los km en long y devuelva el n�mero de UA en int
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca km: ");
		long km = keyboard.nextLong();
		
		double ua = ejercicioconversor.convertirKmAUA(km);
		System.out.println(ua + " UA");
		
	}
}


/*
 * Convertir de Unidad Astron�mica (UA) a km. Escribir un m�todo que 
 * reciba los km en long y devuelva el n�mero de UA en int
 * 
 * buscar esto: int ua = (int) ( km / 150000000);
 */