package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class EjercicioLibroSwitchSencillo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num;
		
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		
		switch (num) {
		case 1 -> System.out.println("Lunes");
		case 2-> System.out.println("Martes");
		case 3-> System.out.println("Miércoles");
		case 4-> System.out.println("Jueves");
		case 5-> System.out.println("Viernes");
		case 6-> System.out.println("Sábado");
		case 7-> System.out.println("Domingo");
		default -> System.out.println("Has introducido un número distinto a 7"); 
			
		}

	}

}
