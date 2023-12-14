package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio3DeCarlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int year;
		
		System.out.print("Introduce un año:");
		year = sc.nextInt();
		
		
		if (year%4==0 && year%100!=0 ) 
			|| (year%100==0 && year%400!=0 ) {
			System.out.println("El año " + year + " es bisiesto");
		} else {
			System.out.println("El año " + year + " NO es bisiesto");
		}
			
	
		
		

	}

}
