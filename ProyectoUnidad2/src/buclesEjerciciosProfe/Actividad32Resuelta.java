package buclesEjerciciosProfe;

import java.util.Scanner;

public class Actividad32Resuelta {

	public static void main(String[] args) {
		
    int edad = 0;
    int sumaEdades = 0;
    int numAlumnos = 0;
    int numMayorDeEdad = 0;

   
		Scanner sc = new Scanner(System.in);
		//vARIABLE DE TIPO ACUMULADOR
		
		System.out.println("Introduce un edad:");
		edad = sc.nextInt();
		
		while (edad>=0) {
			
			sumaEdades+=edad; //Acumulamos edades sumando
			numAlumnos++;
			
			if (edad >=18) {
				//Contamos el nuemro de mayores de edad
				numMayorDeEdad++;
			}
			System.out.println("Introduce otra edad:"); 
			edad = sc.nextInt();
		}
		
		//Las operaciones van fuera del bucle
		double media = sumaEdades/numAlumnos;
		
		System.out.println("Suma de todas las edades: " + sumaEdades); 
		System.out.println("La media de edad es: " + media); 
		System.out.println("El número de alumnos es : " + numAlumnos); 
		System.out.println("El número de mayores es : " + numMayorDeEdad); 
		
	}

}
