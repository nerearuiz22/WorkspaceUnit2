package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio7Refuerzo {

	public static void main(String[] args) {
		
		int num = 0;
		int numAux;
		int contadorExponente = 0;
		int cifra = 0;
		
		//Variable acumulador
		double numDecimal = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número binario para pasar a decimal:");
		num = sc.nextInt();
		
		numAux = num;
		
		//Para sacar las cifras del número hay que hacer el módulo de 10
		
		while (numAux != 0) {
			
			//Si la cifra es 0 no hace falta sumar pq cualquier número multiplicado por 0 es 0
			if (cifra!=0)
			  cifra = numAux %10; //Sacamos las cifras con el módulo de 10
			
			
			  numDecimal = numDecimal + cifra * (Math.pow(2.0,contadorExponente));
			
			  numAux = numAux/10;
			
			  contadorExponente++; 
			
		}
		System.out.print("El decimal del número: " + num + " es: " + numDecimal);
	}

}
