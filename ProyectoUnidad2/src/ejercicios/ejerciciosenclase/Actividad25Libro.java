package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Actividad25Libro {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Introduce un número:");
	    a = sc.nextInt();
	    
	    System.out.print("Introduce un número:");
	    b = sc.nextInt();
	    
	    if (a>b) {
	    	System.out.print(a + " " + b);
	    }else {
	    	System.out.print(b + " " + a);
	    }

	}

}
