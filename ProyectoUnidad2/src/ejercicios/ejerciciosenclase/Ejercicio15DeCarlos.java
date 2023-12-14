package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio15DeCarlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numalumnos;
		
		System.out.print("Introduce tu renta anual:");
		numalumnos = sc.nextInt();
		
		if (numalumnos>=100) {
			int costo = numalumnos * 65;
			System.out.print("El pago es de: " + costo + " y cada alumno debe pagar 65 euros");
		}else if (numalumnos<100 && numalumnos>=50) {
			int costo = numalumnos * 70;
			System.out.print("El pago es de: " + costo + " y cada alumno debe pagar 70 euros");
		}else if (numalumnos<50 && numalumnos>=30) {
			int costo = numalumnos * 95;
			System.out.print("El pago es de: " + costo + " y cada alumno debe pagar 95 euros");
		}else {
			int costo = 4000;
			System.out.print("El pago es de: " + costo);
	}
	}
}
