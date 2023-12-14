package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Actividad28Libro {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a,b,c; 
		 
		 System.out.print("Introduce un número:");
		 a = sc.nextInt();
		 
		 System.out.print("Introduce un número:");
		 b = sc.nextInt();
		 
		 System.out.print("Introduce un número:");
		 c = sc.nextInt();
		 
		 double elevado = Math.pow(b, 2);
		 double d = elevado - 4 * a * c;
		 
		 if ( d > 0 ) {
			 double respositivo = (- b + Math.sqrt(d))/(2*a);
			 double resnegativo = (-b - Math.sqrt(d))/(2*a);
			 System.out.print("Tiene dos soluciones. x1:" + respositivo + "x2:" + resnegativo);
			 
		 }else if (d == 0) {
			 double respositivo = -b/2*a;
			 System.out.print("Tiene una solución. x1:" + respositivo);
			 
		 }else {
			 System.out.print("No hay solución. Un número negativo no puede tener raíz.");
		 }
		 
		
		 
		 
		 
		 

	}

}
