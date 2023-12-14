package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio311Libro {

	public static void main(String[] args) {

		int num = 0;
		int numAux;
		int cifra;
		String Cadena = "";

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número decimal para pasar a binario:");
		num = sc.nextInt();
		
		numAux = num;
		
		while (numAux != 0) {
			 cifra= numAux%2;
			 numAux = numAux/2;
			 Cadena = cifra + Cadena;
				
		}
		System.out.print(Cadena);
		

	}

}
