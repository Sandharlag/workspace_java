import java.util.Scanner;

public class ejerciciobucles {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int numero = keyboard.nextInt();
		
		for (int i=1; i<=6; i++) {
			System.out.println(i);
		}
		
		
	int tabla = 5;
		
		
		for(int i = 0 ; i <= 10; i++) {
			//System.out.println(i + " x 5 = " + (i * tabla));
			System.out.printf("%d x 5 = \n", (i * tabla));
		}
		
		keyboard.close();	

}
}