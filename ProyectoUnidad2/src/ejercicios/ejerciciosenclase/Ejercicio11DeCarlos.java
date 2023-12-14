package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio11DeCarlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int renta;
		
		System.out.print("Introduce tu renta anual:");
		renta = sc.nextInt();
		
		if (renta<10000) {
			System.out.print("El impuesto es del 5%");	
		}else if ((renta>10000)&&(renta<=20000)) {
			System.out.print("El impuesto es del 15%");	
		}else if ((renta>20001)&&(renta<=35000)) {
			System.out.print("El impuesto es del 20%");	
		}else if ((renta>35001)&&(renta<=60000)) {
			System.out.print("El impuesto es del 30%");	
		}else {
			System.out.print("El impuesto es del 45%");	
		}

	}

}
