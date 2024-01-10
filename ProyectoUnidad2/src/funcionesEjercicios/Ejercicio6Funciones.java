package funcionesEjercicios;

import java.util.Scanner;

public class Ejercicio6Funciones {

	public static boolean login(Boolean nombre, Boolean contraseña) {

	}
	
	public static void main(String[] args) {
		
		String nombre = " ";
		String contraseña = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Usuario: ");
		nombre = sc.next();
		System.out.println("Contraseña: ");
		contraseña = sc.next();
		String cadena = "";
		
		boolean login = login(nombre,contraseña);
	}

}
