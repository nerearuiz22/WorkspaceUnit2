package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio12Profe {

	public static void main(String[] args) {
		
		/*
		 * Primer vuelta: * i=1 j=1 hasta 1 
		 * Segunda vuelta ** i=2 j=1 hasta 2 
		 * Tercera vuelta *** i=3 j=1 hasta 3 
		 * Cuarta vuelta  **** i=4 j=1 hasta 4 
		 * Quinta vuelta  ***** i=5 j=1 hasta 5
		 */
		
        int altura= 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura del árbol:");
		altura = sc.nextInt();
		
		for (int i=1; i<=altura; i++) { //El bucle de fuera pinta las filas
		
			for (int j=i; j>=1; j--) {
				System.out.print(2*j-1);
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
