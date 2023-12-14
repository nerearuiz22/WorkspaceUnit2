package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio2Profe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int n;
		
		System.out.println("Escribe un número:");
		n = sc.nextInt();
		
		while (i<n){ 
			i++;
			System.out.println("Vuelta " + i);
	}
	}
}
