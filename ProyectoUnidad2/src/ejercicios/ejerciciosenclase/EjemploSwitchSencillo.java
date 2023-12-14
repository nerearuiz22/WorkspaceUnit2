package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class EjemploSwitchSencillo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num;
		
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		
		switch (num) {
		case 1: System.out.println("Has introducido el 1");
		case 2: System.out.println("Has introducido el 2");
		default: System.out.println("Has introducido un número distinto a 1 y 2"); 
			
		}
		
	}

}
