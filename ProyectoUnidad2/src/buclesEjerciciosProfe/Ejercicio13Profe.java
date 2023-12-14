package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio13Profe {

	public static void main(String[] args) {
		
		/*
		 * Programa que recoja los i numeros imapres hasta el 1 decreciente
		 * 
		 * fila 5, hacemos 5 impares, 97531
		 * Primer vuelta: i=1 j=1 hasta 1   1
		 * Segunda vuelta i=2 j=1 hasta 2   31
		 * Tercera vuelta  i=3 j=1 hasta 3  135
		 * Cuarta vuelta   i=4 j=1 hasta 4  7531
		 * Quinta vuelta   i=5 j=1 hasta 5  97531
		 * 
		 * 
		 * Escribir 2-j*1
		 * 
		 */
		
	
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura del árbol:");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) { //El bucle de fuera pinta las filas
		
			for (int j=i; j<=1;j--) {
				System.out.println("");
			}
			
		}
		System.out.println("");

	}

}
