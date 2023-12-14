package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejemplosclase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número real psotivo o negativo: ");
	    double num = sc.nextDouble();
	     
	     if ((num > 0) && (num < 1))  {
	    	 System.out.print("Es un número casi-cero positivo"); 
	     }else if ((num > -1) && (num < 0)) {
	    	 System.out.print("Es un número casi-cero negativo"); 
	     
	     }else if (num==0) {
	    	 System.out.print("Es igual a 0"); 
	     }else {
	    	 System.out.print("No es un casi-cero"); 
	     }
	     

	}

}
