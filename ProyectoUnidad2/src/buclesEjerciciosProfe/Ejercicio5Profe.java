package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio5Profe {

	public static void main(String[] args) {

		int num = 0;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		num = sc.nextInt ();
		
		for (int i=0; i<=num; i++) {
			
			cont++;
			System.out.println("Number is: " + cont + " and cube of the " + cont + " is: " + (num*num*num));
			break;
		}
		
	}

}
