package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class EjemploSwitchSencilloNuevo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num;
		
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		
		//Expresión lamda, -> la flecha funciona como break a partir de java.13
		
		switch (num) {
		case 1 -> System.out.println("Has introducido el 1");
		
		case 2 -> System.out.println("Has introducido el 2");
		System.out.println("Aquí si hace falta las llaves");
		default: System.out.println("Has introducido un número distinto a 1 y 2"); 
		
		}

	}
	

}
