package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Actividad213Libro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double comidaDiaria, numAnimales, kilosPorAnimal;
		
		System.out.print("Introduce una cantidad de comida diaria:");
		comidaDiaria = sc.nextDouble();
		
		System.out.print("Introduce el número de animales:");
		numAnimales = sc.nextDouble();
		
		System.out.print("Introduce los kilos de alimento por animal:");
		kilosPorAnimal = sc.nextDouble();
		
		double kilosPorAnimal2 = comidaDiaria/numAnimales;
		
		if (kilosPorAnimal2 >= kilosPorAnimal) {
			System.out.print("Hay suficiente alimento para los animales");
		}else {
			double racion = kilosPorAnimal - kilosPorAnimal2;
			System.out.print("La ración que corresponde es:" + kilosPorAnimal + " hace falta:" + racion + " kilos más.");
			
		}

	}

}
