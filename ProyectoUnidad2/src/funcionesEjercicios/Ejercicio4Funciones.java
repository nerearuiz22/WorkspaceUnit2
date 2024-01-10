package funcionesEjercicios;

import java.util.Scanner;

public class Ejercicio4Funciones {
	
	public static double Funcion(double x) {
	
		return Math.pow(x,3)+ 2*x-3;
		
	}

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número (x) : ");
		x = sc.nextInt();
	}

}
