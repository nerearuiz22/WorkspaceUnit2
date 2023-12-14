package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio18DeCarlos {

	public static void main(String[] args) {
		int numSeleccion; 
		double grados;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados:");
		grados = sc.nextDouble();

		System.out.println("Que unidad de medida vas a usar?");
		System.out.println();
		System.out.println("1.Kelvin");
		System.out.println();
		System.out.println("2.Fahrenheit");
		numSeleccion = sc.nextInt();
		
		switch (numSeleccion) {
		case 1: 
			double resultado= grados + 273.15;
			System.out.println("La temperatura en Kelvin es:" + resultado);
			break;
		case 2: 
			resultado = (grados * 9/5)+32;
			System.out.println("La temperatura en Fahrenheit es:" + resultado);
			break;
		default:
			System.out.println("No has introducido ni 1 ni 2");
		}

	}

}
