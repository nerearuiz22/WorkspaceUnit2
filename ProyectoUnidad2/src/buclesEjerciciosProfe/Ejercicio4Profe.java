package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio4Profe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int factorial = 1;
		int i = 0;
		int n;
		
		System.out.println("Escribe un número:");
		n = sc.nextInt();
		
		
		while (i<n){ 
		i++;
		factorial=factorial * i;
		System.out.println(factorial);
		 
	}
	}

}
