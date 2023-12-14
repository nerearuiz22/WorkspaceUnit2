package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio16DeCarlos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double tiempollamada;
		
		System.out.print("Introduce tu renta anual:");
		tiempollamada = sc.nextDouble();
		
		if (tiempollamada <= 5 ) {
			double costo = 5*1;
		}if (tiempollamada <= 8 ) {
			double costo = 5*1+3*0.80;
		}if (tiempollamada <= 10 ) {
			double costo = 5*1+3*0.80+2*0.70;
		}if (tiempollamada > 10 ) {
			double costo = 5*1+3*0.80+2*0.70+(tiempollamada - 10)*0.50;
	}

}
