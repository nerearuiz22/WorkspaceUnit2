package funcionesEjercicios;

import java.util.Scanner;

public class Ejercicio3Funciones {

	static double mediaTemperatura(double min, double max) {
		return (max+min)/2;
	}
	
	public static void main(String[] args) {
		
		int max, min, dias;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de dias: ");
		dias = sc.nextInt();
		
		for (int i = 0; i <= dias; i++)  {
			System.out.println("Introduce el máximo de temperatura: ");
			max = sc.nextInt();
			System.out.println("Introduce el mínimo de temperatura: ");
			min = sc.nextInt();
		}
	}

}
