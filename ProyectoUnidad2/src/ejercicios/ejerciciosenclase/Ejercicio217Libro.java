package ejercicios.ejerciciosenclase;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio217Libro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Random rand = new Random();
		
		int numeroRandom = random.nextInt(1, 99);
		int numeroRandom2 = random.nextInt(1, 99);
		int suma = numeroRandom + numeroRandom2;
		
		System.out.println ("Suma dos valores:" + numeroRandom + " " + numeroRandom2);
		int resultado = sc.nextInt();

		if (resultado=suma) {
			System.out.println ("Felicidades  sabes sumar");
		}else {
			System.out.println ("Resultado incorrecto, la suma es:" + suma);
		}
	} 

}
