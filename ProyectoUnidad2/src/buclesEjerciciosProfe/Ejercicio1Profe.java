package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio1Profe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notaAlumno = 0;
		int sumaNotas = 0;
		double media = 0.0;
		
		//Acumulador
		int numAlumnos = 0;
	
		
		//Para averiguar la máxima y la mínima nota.
		int maxNota = 0;
		int minNota = 10;
		
		//Nombres alumnos
		String nombreAlumno = " ";
		String nombreAlumnoMax = " ";
		String nombreAlumnoMin = " ";
		
		
		System.out.println("Introduce el nombre del alumno");
		nombreAlumno = sc.next();
		
		System.out.println("Introduce la nota del alumno");
		notaAlumno = sc.nextInt();
		
		
		while (!nombreAlumno.equals("fin")){
			
			sumaNotas=sumaNotas+notaAlumno; 
			numAlumnos++;

			if (notaAlumno>=maxNota) {
				maxNota=notaAlumno;
				nombreAlumnoMax = nombreAlumno;
			}
			if (notaAlumno<=minNota) { 
				minNota=notaAlumno;
				nombreAlumnoMin = nombreAlumno;
			}
			
			System.out.println("Introduce el nombre de otro alumno");
			nombreAlumno = sc.next();
			System.out.println("Introduce la nota del alumno");
			notaAlumno = sc.nextInt();
			
			
			
	}
		if (numAlumnos>0) { 
			System.out.println("Alumno con máxima nota:" + nombreAlumnoMax + " " + maxNota);
			System.out.println("Alumno con mínima nota:" + nombreAlumnoMin + " " + minNota);
			System.out.println("La media del curso es:" + (double) sumaNotas/numAlumnos);
		}
	
	}
		

}
