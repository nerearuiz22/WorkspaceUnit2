package funcionesEjercicios;

import java.util.Scanner;

public class Ejercicio1Funciones {
	
	public static void nombreEnPantalla(String nombre) {
		System.out.println("Hola " + nombre + " como estas");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Escribe un nombre por pantalla: ");
		nombre = sc.next();
		nombreEnPantalla(nombre);
	}
	

}
