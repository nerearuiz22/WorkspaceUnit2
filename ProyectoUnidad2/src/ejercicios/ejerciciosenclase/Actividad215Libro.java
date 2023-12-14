package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Actividad215Libro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base,altura;
		
		System.out.print("Introduce un valor para la base de un triángulo:");
	    base = sc.nextDouble();
	    
	    System.out.print("Introduce un valor para la altura de un triángulo:");
	    altura = sc.nextDouble();
	    
	    if (base>=0 && altura>=0) {
	    	double area = (base*altura)/2;
	    	System.out.print("El área del triángulo es:" + area);
	    }else {
	    	System.out.print("No se puede realizar, introduce valores positivos");
	    }

	}

}
