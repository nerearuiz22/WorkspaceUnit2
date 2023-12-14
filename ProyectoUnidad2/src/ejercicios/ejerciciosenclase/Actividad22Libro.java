package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Actividad22Libro {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a,b;
		 
		 System.out.print("Introduzca un número: ");
	     a = sc.nextInt();
	     
	     System.out.print("Introduzca un número: ");
	     b = sc.nextInt();
	     
	     if (a==b) {
	    	 System.out.print("Ambos números son iguales");
	     }else if (a>b) {
	    	 System.out.print(a+ " es mayor que " + b);
	     }
	     else {
	    	 System.out.print(a+ " es menor que " + b);
	     }

	}

}
