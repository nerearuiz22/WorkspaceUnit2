package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Actividad29Libro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		
		if ((num/10)<1) {
			System.out.print("Tiene 1 cifra");
		} else if ((num/10)>=1 && (num/10)<10 ) {
			System.out.print("Tiene 2 cifras");
		}else if ((num/100)>=1 && (num/100)<100 ) {
			System.out.print("Tiene 3 cifras");
		}else if ((num/1000)>=1 && (num/1000)>=1 ) {
			System.out.print("Tiene 4 cifras");
		}else if ((num/10000)>=1 && (num/10000)>=1 ) {
			System.out.print("Tiene 5 cifras");
		 
 
	}
}

}
