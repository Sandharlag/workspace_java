
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hola mundo");
		System.out.println(Math.pow(5, 2));
		System.out.println(2 - 1);
		System.out.println("2*3");
		System.out.println(2 * 3);

		// secuencias de escape
		System.out.println("Hola\nmundo");
		System.out.println("\tHola mundo");
		System.out.println("\"");

		// printf
		System.out.printf("El producto de 5*2 es = %d", 5 * 2).println();
		System.out.printf("5 + 6 + 7 = %d", 5 + 6 + 7).println();

		// variables númericas

		// variable para numero entero
		@SuppressWarnings("unused")
		int edad = 18;

		// variable de tipo flotante
		@SuppressWarnings("unused")
		double precioBarra = 4.3;

		// ejercicio
		// Escribe una sentencia que muestre por pantalla la suma de las tres variables utilizandoSystem.out.println.
		int a = 1, b = 2, c = 1;
		System.out.println(a + b + c);
		//System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c);


		// Cambia el valor de la variable c.3. Escribe de nuevo una sentencia que muestre por pantalla la suma de las tres variablesutilizando System.out.printf.
		c = 2;
		System.out.println(a + b + c);
		
		//int numero1 = 1;
		//int numero2 = 2;
		short numero4 = 32767;
		short numero5 = (short) (numero4 + 1);
		System.out.println(numero5);
		
		//float numero6 = (float) 5.6;
		
		// char solamente para guardar una letra y se utiliza comillas simples
			//	char letra = 'j';
				
		
		boolean bool1 = true;
		//boolean bool2 = false;
		System.out.println(bool1);
				
		// a una variable de tipo primitivo no se le puede asignar el valor de null
		// bool1 = null;
				
		/*
		 * operador de asignaci�n compuesto  
		 */
		int n = 5;
				
		// n = n + 6
		n += 6;
		// n = n + 1
		// n += 1
		n++;
				
		System.out.println(n);		
		
		
		//conversion de tipos
		
		//conversion automatica
		//byte b1 = 9;   byte son 8 bits
		//long l1 = b1;  long son 64 bits
		
		//conversion con casting o explicita
		//long l2 = 800;
		//byte b2 = (byte) l2;

	}
}
