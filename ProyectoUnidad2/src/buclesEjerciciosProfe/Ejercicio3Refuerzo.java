package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio3Refuerzo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		int precioCoche = 0;
		int numCoches = 0;
		int sumaCoches = 0;
	
		int maxPrecio = 0;
		int minPrecio = 0;
		
		
		String nombreModelo = " ";
		String nombreModeloMax = " ";
		String nombreModeloMin = " ";
		
		
		System.out.println("Introduce el modelo del coche:");
		nombreModelo = sc.next();
		
		System.out.println("Introduce el precio del coche:");
		precioCoche = sc.nextInt();
		
		
		while (precioCoche != 0){
			
			sumaCoches=sumaCoches+precioCoche; 
			numCoches++;

			if (precioCoche>maxPrecio) {
				maxPrecio=precioCoche;
				nombreModeloMax = nombreModelo;
			}
			if (precioCoche<minPrecio) { 
				minPrecio=precioCoche;
				nombreModeloMin = nombreModelo;
			}
			
			System.out.println("Introduce el modelo del coche:");
			nombreModelo = sc.next();
			
			System.out.println("Introduce el precio del coche:");
			precioCoche = sc.nextInt();
			
			if (precioCoche == 0){ 
				break;
			}
			
			
	}
		    System.out.println("La cantidad de coches es: " + numCoches);
			System.out.println("El coche más caro es: " + nombreModeloMax + " con el precio: " + maxPrecio);
			System.out.println("El coche más barato es: " + nombreModeloMin + " con el precio: " + minPrecio);
			System.out.println("La media de los precios es: " + (double) sumaCoches/numCoches);
		

	}

}
