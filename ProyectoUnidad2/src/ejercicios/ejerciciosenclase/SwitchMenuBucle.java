package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class SwitchMenuBucle {

	public static void main(String[] args) {
		int opcionNumero = 0; // Contador en 0
		double medida;
		double pulgadas;

		Scanner sc = new Scanner(System.in);

		while (opcionNumero != 5) {
			System.out.println("Que unidad de medida vas a usar?");
			System.out.println();
			System.out.println(" 1. pulgadas");
			System.out.println(" 2. pies");
			System.out.println(" 3. yardas");
			System.out.println(" 4. millas");
			System.out.println("5. Salir");
			System.out.println();
			System.out.println("Introduce el numero seleccionado entre 1 y 5: ");
			opcionNumero = sc.nextInt();

			switch (opcionNumero) {
			case 1:
				System.out.println("Introduce el número de pulgadas ");
				medida = sc.nextDouble();
				pulgadas = medida;
				System.out.println("La conversión a pulgadas es: " + pulgadas);
				break;
			case 2:
				System.out.println("Introduce el número de pies: ");
				medida = sc.nextDouble();
				pulgadas = medida * 12;
				System.out.println("La conversión a pulgadas es: " + pulgadas);
				break;
			case 3:
				System.out.println("Introduce el número de yardas: ");
				medida = sc.nextDouble();
				pulgadas = medida * 36;
				System.out.println("La conversión a pulgadas es: " + pulgadas);
				break;
			case 4:
				System.out.println("Introduce el número de millas: ");
				medida = sc.nextDouble();
				pulgadas = medida * 63360;
				System.out.println("La conversión a pulgadas es: " + pulgadas);
			case 5:
				System.out.println("Salimos del programa");
				break;

			default:
				System.out.println("No ha introdución una opción contemplada en el menú");
				break;

			}
		} // Cerramos la llave del while después del switch para que se incluya

		System.out.println("Fuera del switch");
	}

}
